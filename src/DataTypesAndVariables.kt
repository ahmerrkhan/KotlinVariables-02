
     //Variables in Kotlin

fun main(args : Array<String>){

    //use var(multivariable) use to re-assign the new value also
    //use val(immutable) you cant change the value or re-assign again
    val salary1 = 3000
    var name1 = "Muhammad Ahmer khan"

    println("Name is : "+name1)
    println("The Salary is : "+salary1)

    //also you can specify
    val salary2 : Int = 4000
    var name2 = "Muhammad Kashan"
    println("Name is : "+name2)
    println("Salary is : "+salary2)

    //or
    val age1 : Int
    val age2 : Int

    age1=23
    age2= 24
    println("Age of 1st person is : "+age1)
    println("Age of 2nd person is : "+age2)


    //Diffrence between var and val
    var a : Int= 3000
    a=4000  // you can re assigned any time
    println("a is : "+a)

    val b : Int = 2000
    //b = 5000       // you cant re assigned i.e same as final keyword
    println("b is :"+b)

}
