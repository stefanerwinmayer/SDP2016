package traitsandinheritance.sealedtraits

/**
  * Created by stefanm on 22/02/2016.
  */
sealed trait Shape {
  def sides(): Double

  def perimeter(): Double

  def area(): Double
}

case class Circle(radius: Double) extends Shape {
  def sides(): Double = 1

  def perimeter(): Double = 2 * math.Pi * radius

  def area(): Double = 2 * math.Pi * radius * radius
}

sealed trait Rectangular extends Shape {
  val x: Double
  val y: Double

  def sides(): Double = 4

  def perimeter(): Double = 2 * x + 2 * y

  def area(): Double = x * y
}

case class Rectangle(val x: Double, val y: Double) extends Rectangular

case class Square(val side: Double) extends Rectangular {
  val x = side
  val y = side
}

object Draw {
  def apply(shape: Shape) = shape match {
    case Circle(radius) => println(s"A circle of radius ${radius}cm")
    case Rectangle(x, y) => println(s"A rectangle of width ${x}cm and height ${y}cm")
    case Square(side) => println(s"A square of width and height ${side}cm")
  }
}

object  Main extends App {
  Draw(Circle(10)) // returns "A circle of radius 10cm"
  Draw(Rectangle(3, 4)) // returns "A rectangle of width 3cm and height 4cm"
}

sealed trait Colour {
  val r: Int
  val g: Int
  val b: Int

  def isLight: Boolean = ((r + g + b) / 2) < 382
  def isDark: Boolean = !isLight
}

case object Red extends Colour {
  val r = 255
  val g = 0
  val b = 0
}

case object Yellow extends Colour {
  val r = 255
  val g = 255
  val b = 0
}

case object Pink extends Colour {
  val r = 255
  val g = 192
  val b = 203
}

case class CustomColor(r: Int, g: Int, b:Int ) extends Colour

