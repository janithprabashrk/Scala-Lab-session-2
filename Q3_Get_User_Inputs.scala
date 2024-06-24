def salCalc(normalHrs : Int, otHours : Int) : Unit = {
    val normalPay = 250
    val OT_pay = 85
    //val normalWorkHours = 40
    //val OT_Hours = 30
    val taxRate = 0.12

    var ot_salary = otHours * OT_pay
    var normal_salary = normalPay * normalHrs
    var grossSalary = ot_salary + normal_salary
    var tax = grossSalary * taxRate
    var net_salary = grossSalary - tax
    println("Salary : " + net_salary)
}

