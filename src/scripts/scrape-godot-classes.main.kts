@file:DependsOn("org.jsoup:jsoup:1.16.1")
@file:DependsOn("com.fasterxml.jackson.dataformat:jackson-dataformat-xml:2.15.2")

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.databind.ObjectMapper
import org.jsoup.Jsoup
import org.jsoup.nodes.Document
import java.io.File
import java.net.URL

val classIndexUrl = "https://docs.godotengine.org/en/stable/classes/index.html"
val classLinkClass = "reference"

val objectMapper = ObjectMapper()

Jsoup.parse(URL(classIndexUrl), 30000)
    .getElementsByClass("document")
    .first()!!
    .getElementsByTag("a")
    .asSequence()
    .filter { it.attr("href").startsWith("class_") }
    .filter { !it.attr("href").contains("#") }
    .distinctBy { it.attr("href") }
    .map { it.attr("abs:href") }
    .map { URL(it) }
    .mapIndexed { index, it ->
        println("Requesting URL $index: $it")
        Jsoup.parse(it, 30000)
    }
    .map(::mapToGodotClass)
    .forEach {
        val json = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(it)
        val file = File("output/scrape/${it.name}.json")
        if(file.exists()) {
            file.delete()
        }
        file.parentFile.mkdirs()
        file.createNewFile()
        file.writeText(json)
    }

fun mapToGodotClass(document: Document): GodotClass {
    val name = document.extractClassName()
    val inherits = document.extractInherits()
    val properties = document.extractProperties()
    val constructors = document.extractConstructors()
    val methods = document.extractMethods()
    val operators = document.extractOperators()
    val signals = document.extractSignals()
    val enumerations = document.extractEnumerations()
    return GodotClass(name, inherits, properties, constructors, methods, operators, signals, enumerations)
}

fun Document.extractClassName(): String {
    return getElementsByTag("h1")[0].text().replace("¶", "");
}

fun Document.extractInherits(): String? {
    return getElementsByTag("strong").firstOrNull { it.text() == "Inherits:" }?.nextElementSibling()?.text()
}

fun Document.extractProperties(): List<GodotProperty> {
    val propertyHeader = getElementsByTag("h2")
        .firstOrNull { it.text().startsWith("Properties") } 
    val propertiesTable = propertyHeader?.nextElementSibling() 
    val propertiesTbody = propertiesTable?.firstElementChild() 
    val normalProperties = propertiesTbody?.getElementsByTag("tr")
        ?.map {
            val type = it.getElementsByTag("td")[0].text()
            val name = it.getElementsByTag("td")[1].text()
            GodotProperty(type, name)
        } ?: emptyList()
    
    val themePropertiesHeader = getElementsByTag("h2")
        .firstOrNull { it.text().startsWith("Theme Properties") }
    val themePropertiesTable = themePropertiesHeader?.nextElementSibling()
    val themePropertiesTbody = themePropertiesTable?.firstElementChild()
    val themeProperties = themePropertiesTbody?.getElementsByTag("tr")
        ?.map { 
            val type = it.getElementsByTag("td")[0].text()
            val name = it.getElementsByTag("td")[1].text()
            GodotProperty(type, name)
        } ?: emptyList()
    
    return themeProperties + normalProperties
}

fun Document.extractConstructors(): List<GodotConstructor> {
    val constructorsHeader = getElementsByTag("h2")
        .firstOrNull { it.text().startsWith("Constructors") } ?: return emptyList()
    val constructorsTable = constructorsHeader.nextElementSibling() ?: return emptyList()
    if (constructorsTable.tagName() != "table") {
        return emptyList()
    }
    val tbody = constructorsTable.firstElementChild() ?: return emptyList()
    return tbody.getElementsByTag("tr")
        .map {
            val signature = it.getElementsByTag("td")[1].text()
            GodotConstructor(signature)
        }
}

fun Document.extractMethods(): List<GodotMethod> {
    val methodsHeader = getElementsByTag("h2")
        .firstOrNull { it.text().startsWith("Methods") } ?: return emptyList()
    val methodsTable = methodsHeader.nextElementSibling() ?: return emptyList()
    if (methodsTable.tagName() != "table") {
        return emptyList()
    }
    val tbody = methodsTable.firstElementChild() ?: return emptyList()
    return tbody.getElementsByTag("tr")
        .map {
            val returnType = it.getElementsByTag("td")[0].text()
            val signature = it.getElementsByTag("td")[1].text()
            GodotMethod(returnType, signature)
        }
}

fun Document.extractOperators(): List<GodotOperator> {
    val header = getElementsByTag("h2")
        .firstOrNull { it.text().startsWith("Operators") } ?: return emptyList()
    val table = header.nextElementSibling() ?: return emptyList()
    if (table.tagName() != "table") {
        return emptyList()
    }
    val tbody = table.firstElementChild() ?: return emptyList()
    return tbody.getElementsByTag("tr")
        .map {
            val returnType = it.getElementsByTag("td")[0].text()
            val operator = it.getElementsByTag("td")[1].text()
            GodotOperator(returnType, operator)
        }
}

fun Document.extractSignals(): List<GodotSignal> {
    val signalSection = getElementById("signals") ?: return emptyList()
    val signalParagraphs = signalSection.getElementsByClass("classref-signal")
    return signalParagraphs.map {
        GodotSignal(it.text())
    }
}

fun Document.extractConstants(): List<GodotConstant> {
    val section = getElementById("constants") ?: return emptyList()
    val paragraphs = section.getElementsByClass("classref-constant")
    return paragraphs.map {
        GodotConstant(it.text())
    }
}

fun Document.extractEnumerations(): List<GodotEnum> {
    val section = getElementById("enumerations") ?: return emptyList()
    val paragraphs = section.getElementsByClass("classref-enumeration")

    return paragraphs.map {
        var currentParagraph = it.nextElementSibling()
        val values = mutableListOf<GodotEnumValue>()
        while (currentParagraph != null && !currentParagraph.hasClass("classref-enumeration")) {
            if (currentParagraph.tagName() == "p" && currentParagraph.hasClass("classref-enumeration-constant")) {
                values.add(GodotEnumValue(currentParagraph.text()))
            }
            currentParagraph = currentParagraph.nextElementSibling()
        }
        GodotEnum(it.text(), values)
    }
}

data class GodotClass(
    val name: String,
    val inherits: String?,
    val properties: List<GodotProperty>,
    val constructors: List<GodotConstructor>,
    val methods: List<GodotMethod>,
    val operators: List<GodotOperator>,
    val signals: List<GodotSignal>,
    val enumerations: List<GodotEnum>
) {
    @JsonIgnore
    fun isNotEmpty(): Boolean {
        return properties.isNotEmpty()
                || methods.isNotEmpty()
                || signals.isNotEmpty()
                || enumerations.isNotEmpty()
    }
}

data class GodotProperty(val type: String, val name: String)

data class GodotConstructor(val signature: String)

data class GodotMethod(val returnType: String, val signature: String)

data class GodotOperator(val returnType: String, val operator: String)

data class GodotConstant(val signature: String)

data class GodotEnum(val name: String, val values: List<GodotEnumValue>)

data class GodotEnumValue(val signature: String)

data class GodotSignal(val signature: String)
