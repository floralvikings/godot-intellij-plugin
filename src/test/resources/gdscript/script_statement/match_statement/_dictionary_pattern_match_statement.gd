func test():
    match x:
        {}:
            print("Empty dict")
        {"name": "Dennis"}:
            print("The name is Dennis")
        {"name": "Dennis", "age": var age}:
            print("Dennis is ", age, " years old.")
        {"name", "age"}:
            print("Has a name and an age, but it's not Dennis :(")
        {"key": "godotisawesome", ..}:
            print("I only checked for one entry and ignored the rest")