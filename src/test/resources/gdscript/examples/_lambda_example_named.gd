func test():
    var lambda = func my_lambda(x):
        print(x)
    var answer = 42
    lambda.call(answer)