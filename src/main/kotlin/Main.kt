fun main(args: Array<String>) {
    val employee1 = Employees(1,"John Doe",2)
    val employee2 = Employees(2,"Jane Smith", 1)
    val employee3 = Employees(3, "Joe Snuffy", 3)
    employee1.printEmployee()
    println("\n")
    employee2.printEmployee()
    println("\n")
    employee3.printEmployee()
}

class Employees constructor(var employeeNumber: Int,
                            var employeeName: String,
                            var employeeShift: Int
){
    fun printEmployee(){
        println("Employee Number: $employeeNumber \nEmployee Name: $employeeName \nEmployee Shift: $employeeShift")
    }
}