fun main(args:Array<String>){
    var a = 10.0
    var b = 5.0

    /*  1. a+=b -> a = a+b*/
    a+=b
    println("Addition: ${a}")
//    2.a-=b -> a= a-b
    a-=b
    println("Subtraction: ${a}")
//    3.a*=b -> a = a*b
    a*=b
    println("Multiplication: ${a}")
//    4. a/=b -> b = a/b
    a/=b
    println("Division: ${a}")
//    5. a%=b -> a = a%b
    a%=b
    println("Modulus: ${a}")
}