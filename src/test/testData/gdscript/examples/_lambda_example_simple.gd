func test():
    var lambda = func(x): print(x);
    var answer = 42
    lambda.call(42) # Prints "42"