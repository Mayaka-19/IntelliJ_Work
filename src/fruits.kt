class fruits {
    var type=""
    var color=""
    var price=0
}

fun main() {
    val matunda=fruits()
    val matunda1=fruits()
    val matunda2=fruits()
    val matunda3=fruits()
    matunda.type="Watermelon"
    matunda.color="Green"
    matunda.price=600

    matunda1.type="Banana"
    matunda1.color="Yellow"
    matunda1.price=10

    matunda2.type="Passion"
    matunda2.color="Green"
    matunda2.price=20

    matunda3.type="Apple"
    matunda3.color="Red"
    matunda3.price=20

    println(matunda.type)
    println(matunda.color)
    println(matunda.price)

    println(matunda1.type)
    println(matunda1.color)
    println(matunda1.price)

    println(matunda2.type)
    println(matunda2.color)
    println(matunda2.price)

    println(matunda3.type)
    println(matunda3.color)
    println(matunda3.price)
}
