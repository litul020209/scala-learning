package Loops

// Take a number n = 123456. Count how many digits are even and how many are odd. Do not convert the number to a String.

object  NumberClassification extends App{
    var n:Int = 123456
    
    var temp:Int = n

    var even:Int = 0

    var odd:Int = 0

    var end:Boolean = true

    while(end == true){
        var digit = temp % 10
        
        temp = (temp / 10).toInt

        if (digit % 2 == 0){
            even += 1
        }else if (digit % 2 != 0){
            odd += 1
        }

        if (temp == 0){

            end = false
        }
    }

    println(s"total number of even digit is $even")

    println(s"total number of even digit is $odd")
}