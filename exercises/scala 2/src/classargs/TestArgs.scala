package classargs

import com.atomicscala.AtomicTest._

object TestArgs extends App {
  val family1 = new Family("Mum", "Dad", "Sally", "Dick")
  family1.familySize() is 4

  val family2 = new Family("Dad", "Mom", "Harry")
  family2.familySize() is 3

  val family3 = new FlexibleFamily("Mum", "Dad", "Sally", "Dick")
  family3.familySize() is 4

  val family4 = new FlexibleFamily("Dad", "Mom", "Harry")
  family4.familySize() is 3

  squareThem(2) is 4
  squareThem(2, 4) is 20
  squareThem(1, 2, 4) is 21

  def squareThem(numbers: Int*) = {
    var sum = 0
    for (number <- numbers) {
      sum += number * number
    }
    sum
  }
}

