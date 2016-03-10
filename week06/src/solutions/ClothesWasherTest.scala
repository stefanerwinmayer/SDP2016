package solutions

import atomicscala.AtomicTest._

class ClothesWasher(val model: String, val capacity: Double) {
  val cycles = 5

  def this(model: String) = {
    this(model, 2)
  }

  def this(capacity: Double) = {
    this("Unknown", capacity)
  }

  def this() = {
    this("Unknown", 2)
  }

}

object ClothesWasherTest extends App {

  val washer1 = new ClothesWasher
  washer1.capacity is 2D
  washer1.model is "Unknown"

  val washer2 = new ClothesWasher("AllInOne")
  washer2.capacity is 2D
  washer2.model is "AllInOne"

  val washer3 = new ClothesWasher(3.6D)
  washer3.capacity is 3.6D
  washer3.model is "Unknown"


}
