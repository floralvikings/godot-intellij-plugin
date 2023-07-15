func outer_func():
    var x = 1
    return x

class InnerClass extends Node:
	var a = 10
	var b = 10

	func test_func():
	    print("hello world")
	    return 1

# Constructor
func _init():
    print("Constructed!")
    var lv = Something.new()
    print(lv.a)