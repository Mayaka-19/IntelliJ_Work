open class parent {
    var num=56
    var jina="Johnson"
}
class child:parent(){
    fun display(){
        println("The number from my parent class is $num")
    }

}
class child2:parent(){
    fun output(){
        println("My name is $jina")
    }

}

fun main() {
    val myobj=child()
    println(myobj.display())
    val me=child2()
    println(me.output())
}