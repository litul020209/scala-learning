package Loops

object MultipleGenerators extends  App{
    for {
        i <- 1 to 3
        j <- 1 to 5
    }{
        println(j)
    }
}