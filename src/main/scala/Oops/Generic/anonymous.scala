package Oops.Generic

object anonymous extends App{
  // Abstract class with multiple abstract methods
  abstract class Shape(val color: String) {
    def area(): Double // abstract — no body

    def perimeter(): Double // abstract — no body

    // Concrete method — has body
    def describe(): Unit = {
      println(s"Color     : $color")
      println(f"Area      : ${area()}%.2f")
      println(f"Perimeter : ${perimeter()}%.2f")
    }
  }

  // Create anonymous Circle — no class name needed!
  val circle = new Shape("Red") {
    val radius = 7.0

    override def area(): Double = math.Pi * radius * radius

    override def perimeter(): Double = 2 * math.Pi * radius
  }

  // Create anonymous Rectangle — no class name needed!
  val rectangle = new Shape("Blue") {
    val width = 5.0
    val height = 3.0

    override def area(): Double = width * height

    override def perimeter(): Double = 2 * (width + height)
  }

  // Create anonymous Triangle — no class name needed!
  val triangle = new Shape("Green") {
    val base = 6.0
    val height = 4.0

    override def area(): Double = 0.5 * base * height

    override def perimeter(): Double = 6.0 + 5.0 + 5.0
  }


  // ===== USAGE =====
  println("=== Circle ===")
  circle.describe()
  // Color     : Red
  // Area      : 153.94
  // Perimeter : 43.98

  println("\n=== Rectangle ===")
  rectangle.describe()
  // Color     : Blue
  // Area      : 15.00
  // Perimeter : 16.00

  println("\n=== Triangle ===")
  triangle.describe()
  // Color     : Green
  // Area      : 12.00
  // Perimeter : 16.00
}
