package solutions

import atomicscala.AtomicTest._

class Item(val name: String, var price: Int) {

  def cost(grocery: Boolean = false, medication: Boolean = false, rate: Double = 0.10): Double = {
    if (grocery || medication) price
    else price + (rate * price)
  }
}

object ItemTest extends App {
  val flour = new Item(name = "flour", 4)
  flour.cost(grocery = true) is 4

  val sunscreen = new Item(
    name = "sunscreen", 3)
  sunscreen.cost() is 3.3

  val tv = new Item(
    name = "television", 500)
  tv.cost(rate = 0.06) is 530
}
