package com.github.floralvikings.godotea.language.gdscript.parameterinfo

import com.github.floralvikings.godotea.language.gdscript.psi.*
import com.github.floralvikings.godotea.language.gdscript.typification.TypeInferenceService
import com.github.floralvikings.godotea.language.gdscript.typification.structure.GDFunction
import com.intellij.codeInsight.CodeInsightSettings
import com.intellij.lang.parameterInfo.CreateParameterInfoContext
import com.intellij.lang.parameterInfo.ParameterInfoHandlerWithTabActionSupport
import com.intellij.lang.parameterInfo.ParameterInfoUIContext
import com.intellij.lang.parameterInfo.UpdateParameterInfoContext
import com.intellij.openapi.components.service
import com.intellij.openapi.diagnostic.Logger
import com.intellij.psi.PsiElement
import com.intellij.psi.tree.IElementType
import com.intellij.psi.util.elementType
import com.intellij.refactoring.suggested.startOffset

class GDScriptParameterInfoHandler : ParameterInfoHandlerWithTabActionSupport<GDScriptCall, GDFunction, PsiElement> {

    companion object {
        private val log = Logger.getInstance(GDScriptParameterInfoHandler::class.java)
        
        val STOP_SEARCH_CLASSES: MutableSet<Class<out PsiElement>> = mutableSetOf(
            GDScriptFile::class.java,
            GDScriptFunctionDeclaration::class.java,
            GDScriptBlock::class.java,
            GDScriptInnerClassDeclaration::class.java,
            GDScriptClassBlock::class.java
        )

        private fun collectParameterInfo(call: GDScriptCall): Array<GDFunction> {
            val parent = call.parent
            if (parent !is GDScriptInvocationExpression) {
                return emptyArray()
            }

            val typeInferenceService = call.project.service<TypeInferenceService>()
            val ownerType = typeInferenceService.inferFunctionOwnerType(parent) ?: return emptyArray()

            return ownerType.functions.filter { it.name == parent.id.text }.toTypedArray()
        }

        private fun getCurrentParameterIndex(call: GDScriptCall, offset: Int): Int {
            var idx = 0
            var child: PsiElement? = call.getFirstChild()
            while (child != null) {
                if (child.textRange.contains(offset)) {
                    return idx
                }
                if (child.node.elementType === GDScriptTypes.COMMA) {
                    idx++
                }
                child = child.nextSibling
            }
            return idx
        }


        private fun findCall(psiElement: PsiElement?): GDScriptCall? {
            var current = psiElement
            while (current != null && current::class.java !in STOP_SEARCH_CLASSES) {
                current = current.parent
                if (current is GDScriptCall) {
                    return current
                }
            }
            return null
        }
    }

    override fun findElementForParameterInfo(context: CreateParameterInfoContext): GDScriptCall? {
        val element = context.file.findElementAt(context.offset - 1)
        val call = findCall(element)
        if (element.elementType != GDScriptTypes.R_PAREN && call != null) {
            val itemsToShow = collectParameterInfo(call)
            context.itemsToShow = itemsToShow
        }
        return call
    }

    override fun findElementForUpdatingParameterInfo(context: UpdateParameterInfoContext): GDScriptCall? =
        findCall(context.file.findElementAt(context.offset - 1))

    override fun getActualParameterDelimiterType(): IElementType = GDScriptTypes.COMMA

    override fun getActualParametersRBraceType(): IElementType = GDScriptTypes.R_PAREN

    override fun getArgumentListAllowedParentClasses(): MutableSet<Class<*>> =
        mutableSetOf(GDScriptInvocationExpression::class.java)

    override fun getArgListStopSearchClasses(): MutableSet<out Class<*>> = STOP_SEARCH_CLASSES

    override fun getArgumentListClass(): Class<GDScriptCall> = GDScriptCall::class.java

    override fun getActualParameters(o: GDScriptCall): Array<PsiElement> = o.expressionList.toTypedArray()

    override fun updateUI(p: GDFunction?, context: ParameterInfoUIContext) {
        val settings = CodeInsightSettings.getInstance()
        val function = p ?: return
        val owner = context.parameterOwner as? GDScriptCall ?: return
        val ownerParent = owner.parent
        
        if(ownerParent !is GDScriptInvocationExpression) {
            return
        }

        var highlightStartOffset = -1
        var highlightEndOffset = -1

        val currentParameter = context.currentParameterIndex
        val buffer = StringBuilder()
        
        if(settings.SHOW_FULL_SIGNATURES_IN_PARAMETER_INFO) {
            buffer.append("${function.returnType} ")
            buffer.append("${function.name}(")
        }
        
        if(function.parameters.size > 0) {
            function.parameters.forEachIndexed { index, param -> 
                val startOffset = buffer.length
                buffer.append("${param.name}: ${param.type}")
                val endOffset = buffer.length
                if(index < function.parameters.size - 1) {
                    buffer.append(", ")
                }
                if(currentParameter == index && context.isUIComponentEnabled) {
                    highlightStartOffset = startOffset
                    highlightEndOffset = endOffset
                }
            }
        } else {
            buffer.append("no parameters")
        }
        
        if(settings.SHOW_FULL_SIGNATURES_IN_PARAMETER_INFO) {
            buffer.append(")")
        }

        val hint = buffer.toString()
        val disabled = !context.isUIComponentEnabled
        val strikeout = false
        val disabledBeforeHighlight = true
        val background = context.defaultParameterColor
        context.setupUIComponentPresentation(
            hint,
            highlightStartOffset,
            highlightEndOffset,
            disabled,
            strikeout,
            disabledBeforeHighlight,
            background
        )
    }

    override fun updateParameterInfo(parameterOwner: GDScriptCall, context: UpdateParameterInfoContext) {
        val currentParameterIndex = getCurrentParameterIndex(parameterOwner, context.offset)
        context.setCurrentParameter(currentParameterIndex)
        
        val objects = context.objectsToView
        
        for(i in objects.indices) {
            val obj = objects[i]
            if(obj !is GDFunction) {
                continue
            }
            if(currentParameterIndex < obj.parameters.size) {
                // TODO Check parameter types
                context.setUIComponentEnabled(i, true)
            }
        }
    }

    override fun showParameterInfo(element: GDScriptCall, context: CreateParameterInfoContext) {
        context.showHint(element, element.startOffset, this)
    }
}
