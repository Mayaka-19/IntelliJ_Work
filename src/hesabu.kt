class hesabu {
    //data member
    var num1:Int=67
    var num2:Int=98
    //MEMBER FUNCTION
    fun arithmetic():Int{
        return num1*num2
    }
}

fun main() {
    //Creating objects
    val myobj=hesabu()
    println(myobj.arithmetic())
}