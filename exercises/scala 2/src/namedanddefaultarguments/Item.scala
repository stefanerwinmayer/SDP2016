package namedanddefaultarguments

import com.atomicscala.AtomicTest._

/**
  * Created by stefanm on 15/02/2016.
  */
class Item(name: String, price: Double) {
  def cost(grocery: Boolean = false, medication: Boolean = false, rate: Double = 0.10) = {
    if (grocery || medication) {
      price
    } else {
      price + (price * rate)
    }
  }
}

object ItemTest extends App {
  val flour = new Item(name="flour", 4)
  flour.cost(grocery=true) is 4
  val sunscreen = new Item(
    name="sunscreen", 3)
  sunscreen.cost() is 3.3
  val tv = new Item(name="television", 500)
  tv.cost(rate = 0.06) is 530
}
