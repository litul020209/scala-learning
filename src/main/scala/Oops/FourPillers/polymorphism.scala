package Oops.FourPillers

object polymorphism extends App {
  val animals: List[Ani] = List(new Dg(), new Ct())
  
  for (a <- animals) {
    a.sound()
  }


}

trait Ani {

  def sound(): Unit

}

class Dg extends Ani {

  def sound(): Unit = {
    println("Bark")
  }

}

class Ct extends Ani {

  def sound(): Unit = {
    println("Meow")
  }

}