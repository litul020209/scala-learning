package Functions

object functionOverloading extends App{
  def add(a:Int , b:Int ): Int = {
      a+b
  }
  def add(a:Int , b:Int , c:Int):Int= {
      a+b+c
  }

  def add(a:Float , b:Float):Float ={
     a+b
  }

  add(1,2)
}
