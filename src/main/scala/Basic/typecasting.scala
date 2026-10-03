package Basic

object Typecasting  extends App{
var x = 10
var y = x.toLong

println(x , x.getClass())
println(y, y.getClass())

val c:Char = 'X'
val v = c.toInt
println(v , v.getClass())
}