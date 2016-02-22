package traitsandinheritance

/**
  * Created by stefanm on 22/02/2016.
  */
class Rectangle(val x: Double, val y: Double) extends Shape {
  def sides(): Double = 4

  def perimeter(): Double = 2 * x + 2 * y

  def area(): Double = x * y
}
