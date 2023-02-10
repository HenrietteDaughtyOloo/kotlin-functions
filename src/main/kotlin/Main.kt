fun main(){
    name("Janet")
    name("Fedora")
 var w= modulus(34, 5)
    println(w)


  var x= addition(3.0, 4.2, 5.0, 9.0)
    println(x)

  aboutMe("Iam passionate about exploring new things and I enjoy coding")
  aboutMe("I can dance Salsa, Kizomba, and Bachatta.")
}
fun name(name: String){
    println("Hello $name")


}
fun modulus(num1: Int, num2: Int):Int{
    var modulus = num1 % num2
    return modulus
}
fun addition(num1: Double, num2: Double, num3: Double, num4: Double):Double{
    var sum = num1 + num2 + num3 + num4
    return sum
}
fun aboutMe(about: String){
    println("An interesting thing about me is that: $about")
}
