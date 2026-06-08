package Functions

object variableLength extends App{
  def sample(x:Int*) ={
      println(x.getClass)
      println(x)

  }
  sample(1,2,3,4)

}
