class Student(val name: String, val age: Int) {

  // Instance Variable
  private var marks: Int = 0

  // Instance Method
  def setMarks(m: Int): Unit = {
    marks = m
  }

  def display(): Unit = {
    println(s"Name : $name")
    println(s"Age  : $age")
    println(s"Marks: $marks")
  }
}

object Student {

  // Companion Object Variable
  val schoolName: String = "ABC School"

  // Companion Object Method
  def welcomeMessage(): Unit = {
    println("Welcome to Student Management System")
  }
}

object Main extends App {

  Student.welcomeMessage()

  val student1 = new Student("Biswa", 22)

  student1.setMarks(85)

  student1.display()

  println(Student.schoolName)
}