def OT_salary() : Float = {
    85 * 30
}

def normal_salary() : Float = {
    250 * 40
}

def gross_salary() : Float = {
    OT_salary() + normal_salary()
}

def tax() : Float = {
    gross_salary() * 0.12f
}

def net_salary() : Float = {
    gross_salary() - tax()
}



