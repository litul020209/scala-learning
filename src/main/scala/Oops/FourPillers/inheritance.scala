package Oops.FourPillers

object inheritance {


val d = new Dog

d.eat

}

class Animal {
  def eat: Unit = println("Eat")

}

class Dog extends Animal {
  override def eat: Unit = {
    super.eat
    println("crunch crunch")
  }
}