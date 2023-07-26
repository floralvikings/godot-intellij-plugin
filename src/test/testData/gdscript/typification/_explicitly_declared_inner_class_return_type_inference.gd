class InnerClass:
    func test() -> int:
        return 1

func another_test():
    var inner = InnerClass()
    var x = inner.test()