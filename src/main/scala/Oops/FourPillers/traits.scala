package Oops.FourPillers

object traits extends App{


}
trait sample(name:String) {
  def hello : String
  def world: Unit =  println("Hello World")
}

class Sample1(name:String) extends sample(name):
      override def hello =  "Hello"
      
      
end Sample1
