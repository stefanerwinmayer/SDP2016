package solutions

object MyVectorTest extends App {
  def forecast(temp: Int): String = {
    temp match {
      case 100 => "Sunny"
      case 80 => "Mostly Sunny"
      case 50 => "Partly Sunny"
      case 20 => "Mostly Cloudy"
      case 0 => "Cloudy"
      case _ => "Unknown"
    }
  }

  val data = Vector(100,80,50,20,15,80,20)
  //println(data)

  def forecastLoop(data: Vector[Int]): Unit = {
    for (s <- data)
      println("forecast(" + s + ") is " + forecast(s))
  }

  forecastLoop(data)
}
