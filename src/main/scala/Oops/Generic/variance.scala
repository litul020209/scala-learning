package Oops.Generic

object variance extends App{

//
//  class Animal
//
//  class Dog extends Animal
//
//  // Invariant — default
//  class InvBox[T](var value: T)
//
//  // Covariant — read only
//  class CovBox[+T](val value: T)
//
//  val dog = new Dog
//
//  // Test 1 — Invariant
//  val invDogBox: InvBox[Dog] = new InvBox(dog)
//  // val invAnimalBox: InvBox[Animal] = invDogBox
//
//  // Test 2 — Covariant
//  val covDogBox: CovBox[Dog] = new CovBox(dog)
//  val covAnimalBox: CovBox[Animal] = covDogBox
//
//  println("Covariant works: " + covAnimalBox.value)
class Box[A](var content: A)

  abstract class Animal:
    def name: String

  case class Cat(name: String) extends Animal
  case class Dog(name: String) extends Animal

  val myAnimal: Cat = Cat("Felix")
  val myCatBox: Box[Cat] = Box[Cat](myAnimal)
//  val myAnimalBox: Box[Animal] =  // this doesn't compile
//  val myAnimal: Animal = myAnimalBox.content
}
