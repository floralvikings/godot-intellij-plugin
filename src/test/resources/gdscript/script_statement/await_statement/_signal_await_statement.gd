func wait_confirmation():
    print("Prompting user")
    await $Button.button_up # Waits for the button_up signal from Button node.
    print("User confirmed")
    return true