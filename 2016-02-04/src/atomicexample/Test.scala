package atomicexample

import atomicscala.AtomicTest._

class Cup {
  val max = 100
  var percentFull = 0

  def add(increase: Int): Int = {
    percentFull += increase
    if (percentFull > max) percentFull = max
    percentFull // Return this value
  }
}

object MyMain extends App {

  val cup = new Cup
  cup.add(45) is 45
  cup.add(-15) is 30
  cup.add(-50) is -20
}