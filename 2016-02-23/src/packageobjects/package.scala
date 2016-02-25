package packageobjects

package object apples extends RedApples with GreenApples {
  val redApples = List(red1, red2, red3)
  val greenApples = List(green1, green2)
}

trait RedApples {
  val red1, red2, red3 = "red"
}

trait GreenApples {
  val green1, green2 = "green"
}