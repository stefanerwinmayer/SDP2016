package traitsandinheritance

/**
  * Created by stefanm on 22/02/2016.
  */
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

