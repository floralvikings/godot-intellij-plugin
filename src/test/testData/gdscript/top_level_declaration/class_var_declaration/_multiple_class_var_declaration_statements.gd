@onready
var a: int
@export var s = "Hello";
var another: String
var arr = [1, 2, 3]
var dict = {"key": "value", 2: 3};
var other_dict = {key = "value", other_key = 2}
var typed_var: int
var inferred_type := "String"
var testBlockSetGet: int
    get:
        return 1
    set(new_value):
        test = new_value
var testSetGet: get = _getter, set = _setter;