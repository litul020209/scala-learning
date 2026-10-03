package Basic

object CodeBlock extends App{
    val x = {
        var a = 10
        var b = 20
        var c = "Hello"
        c
    }

    println( x )
    println(x.getClass())

}