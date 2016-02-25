package traitsandinheritance.sealedtraits

/**
  * Created by stefanm on 22/02/2016.
  */
sealed trait Shape {

  def sides(): Double

  def perimeter(): Double

  def area(): Double

  val colour: Colour
}

case class Circle(radius: Double, colour: Colour) extends Shape {
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

case class Rectangle(val x: Double, val y: Double, colour: Colour) extends Rectangular

case class Square(val side: Double, colour: Colour) extends Rectangular {
  val x = side
  val y = side
}

object Draw {
  def apply(shape: Shape) = shape match {
    case Circle(radius, colour) => println(s"A ${getColour(colour)} circle of radius ${radius}cm")
    case Rectangle(x, y, colour) => println(s"A ${getColour(colour)} rectangle of width ${x}cm and height ${y}cm")
    case Square(side, colour) => println(s"A ${getColour(colour)} square of width and height ${side}cm")
  }

  def getColour(colour: Colour) = colour match {
    case Red => "red"
    case Yellow => "yellow"
    case Pink => "pink"
    case CustomColor(r, g, b) => if (colour.isDark) "dark" else "light"
  }
}

object  Main extends App {
  Draw(Circle(10, Red)) // returns "A circle of radius 10cm"
  Draw(Rectangle(3, 4, Pink)) // returns "A rectangle of width 3cm and height 4cm"
  Draw(Square(6, CustomColor(255, 255, 255)))
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

