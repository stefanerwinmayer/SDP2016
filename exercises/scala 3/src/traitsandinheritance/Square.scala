package traitsandinheritance

/**
  * Created by stefanm on 22/02/2016.
  */
case class Square(val side: Double) extends Rectangular {
  val x = side
  val y = side
}
