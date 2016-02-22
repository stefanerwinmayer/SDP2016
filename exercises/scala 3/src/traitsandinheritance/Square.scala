package traitsandinheritance

/**
  * Created by stefanm on 22/02/2016.
  */
case class Square(val side: Double) extends Shape {
  def sides(): Double = 4

  def perimeter(): Double = 4 * side

  def area(): Double = side * side
}
