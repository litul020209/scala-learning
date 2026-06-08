package Functions

object fibonacciSeries extends App{
   def fibonacci(num:Int):Int={
       if(num == 0 || num == 1){
         1
       }else{
         fibonacci(num-1)+fibonacci(num-2)
       }
  }
  var x = fibonacci(5)
  println(x)

}
