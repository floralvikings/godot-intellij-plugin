func test():
    match x:
        []:
            print("Empty array")
        [1, 3, "test", null]:
            print("Very specific array")
        [var start, _, "test"]:
            print("First element is ", start, ", and the last is \"test\"")
        [42, ..]:
            print("Open ended array")