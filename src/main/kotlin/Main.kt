/*
    ID      : 30065695
    NAME    : Raihan Khalil Abdillah
    AT1 - Portofolio 1, Activity 6, Task A
    Compute Methods
 */

fun main(args: Array<String>) {
    print("Enter the temperature in Fahrenheit: ")
    val tempF: Double = readln().toDouble()
    print("Enter the first side of the triangle: ")
    val sideA: Int = readln().toInt()
    print("Enter the second side of the triangle: ")
    val sideB: Int = readln().toInt()

    var c = ComputeMethods()

    println()
    println("$tempF F degree is equal to ${c.fToC(degreeF = tempF)} C.")
    println("Right side Triangle with side ${sideA} and ${sideB} would have ${c.hypotenuse(sideA, sideB)} as its hypotenuse.")
    println("You have rolled ${c.roll()}.")

}