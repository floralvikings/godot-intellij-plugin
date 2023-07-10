# state.gd (inherited class).
var entity = null
var message = null


func _init(e=null):
    entity = e


func enter(m):
    message = m


# idle.gd (inheriting class).
class idle extends "state.gd":

    func _init(e=null, m=null):
        super(e)
        # Do something with 'e'.
        message = m