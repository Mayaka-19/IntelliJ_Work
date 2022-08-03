class wanafunzi(var Name:String,var Gender:String,var PhoneNo:Int,var Cousretaken:String) {
}

fun main() {
    val obj=wanafunzi("Johnson","Male",705779938, "Software Engineering")
    println("THe student name is "+obj.Name)
    println("THe gender is "+obj.Gender)
    println("The mobile number is "+obj.PhoneNo)
    println("The student's name is "+obj.Name +  " is "+obj.Gender +  " his mobile number is "+obj.PhoneNo +  " and the course taken is "+obj.Cousretaken)
}