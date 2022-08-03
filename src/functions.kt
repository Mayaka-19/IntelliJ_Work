import java.awt.Color

fun calculate(){
    var num1=56
    var num2=90
    println("The sum of $num1 and $num2 is "+(num1+num2))
    println("The product of $num1 and $num2 is "+(num1*num2))
    println("The difference between $num1 and $num2 is "+(num2-num1))
    println("The quotient of $num1 and $num2 is "+(num2/num1))
}
fun main() {
    calculate()
    jina()
    cars("Subaru", "blue", 2010)
    cars("Mercedes","white",2020)

}
fun jina(){
    println("My name is Johnson")
}
fun cars(name: String,color: String,year: Int){
    println("My car model is $name, is $color in color and was manufactured in $year")

}


