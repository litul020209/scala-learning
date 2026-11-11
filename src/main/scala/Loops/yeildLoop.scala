package Loops

object YeildLoop extends App{

    var result = for (i <- 1 to 5){
        i
    }

    println(result) // result value is () not 5

    var result1 = 0

    for (i <- 1 to 5) {
    i * 10
    result1 = i * 100
    }

    println(result1)

}