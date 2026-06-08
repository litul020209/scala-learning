package Oops.Generic

object genericEx1 extends App{
  class AlphaNumeric[Any] {

  }

  class MyList[A] {

  }
  class MyMap[A,B] {

  }
  val p = new AlphaNumeric[Int]
  val m = new MyList[String]

  object student {
    def empty[A]: A = ???
  }

  val s1 = student.empty[Int]
}
