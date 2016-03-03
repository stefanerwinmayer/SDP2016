package solutions

import atomicscala.AtomicTest._

class Family(names: String*) {

  def familySize(): Int = {
    var count = 0
    for (str <- names) {
      count = count + 1
    }
    count
  }
}

object TestArgs extends App {
  val family1 = new Family("Mum", "Dad", "Sally", "Dick")
  family1.familySize() is 4

  val family2 = new Family("Dad", "Mom", "Harry")
  family2.familySize() is 3
}

