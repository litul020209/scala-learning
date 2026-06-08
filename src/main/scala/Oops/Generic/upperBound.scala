package Oops.Generic

object upperBound extends App{
    class Animal(val name: String) {
      def eat(): Unit = println(s"$name is eating!")

      def sleep(): Unit = println(s"$name is sleeping!")
    }

    class Dog(name: String) extends Animal(name) {
      def bark(): Unit = println(s"$name says: Woof!")
    }

    class Cat(name: String) extends Animal(name) {
      def meow(): Unit = println(s"$name says: Meow!")
    }

    class Poodle(name: String) extends Dog(name) {
      def dance(): Unit = println(s"$name is dancing!")
    }


    class AnimalShelter[T <: Animal](val animal: T) {

    def introduce(): Unit = {
      println(s"Animal name  : ${animal.name}")
      animal.eat()
      animal.sleep()
    }

    def getAnimal: T = animal
  }

  val dogShelter = new AnimalShelter[Dog](new Dog("Bruno"))
  dogShelter.introduce()

  val generalShelter = new AnimalShelter[Animal](new Animal("Unknown"))
  generalShelter.introduce()
  
}
