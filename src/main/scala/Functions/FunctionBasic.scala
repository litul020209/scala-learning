package Functions

object FunctionBasic extends App{
  def sample(a:Int,b:Int,c:Int = 5):Int = {
      println("Sum of a+b is: ")
      a+b+c
  }
  var ans = sample(10,20)
  println(ans)
}
