package traitsandinheritance

/**
  * Created by stefanm on 22/02/2016.
  */
case class Circle(val radius: Double) extends Shape {
  def sides(): Double = 1

  def perimeter(): Double = 2 * math.Pi * radius

  def area(): Double = 2 * math.Pi * radius * radius
}
