package Functions

object factorial extends App{
  def factorial(num:Int):Int = {
      if(num == 0){
         1
      }else{
        num * factorial(num - 1)
      }
  }
  var ans = factorial(5)
  println(ans)
}
