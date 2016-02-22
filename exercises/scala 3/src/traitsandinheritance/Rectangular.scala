package traitsandinheritance

/**
  * Created by stefanm on 22/02/2016.
  */
trait Rectangular extends Shape {
  val x: Double
  val y: Double

  def sides(): Double = 4

  def perimeter(): Double = 2 * x + 2 * y

  def area(): Double = x * y
}
