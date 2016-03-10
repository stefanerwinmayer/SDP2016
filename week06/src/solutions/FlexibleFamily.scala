package solutions

import atomicscala.AtomicTest._

class FlexibleFamily(mom: String, dad: String, kids: String*) {

  def familySize(): Int = {
    var count = 2 // see change!
    for (k <- kids) {
      count = count + 1
    }
    count
  }
}

object FlexibleFamilyTest extends App {
  val family3 = new FlexibleFamily("Ma","Pa", "John", "Dude", "Felix")
  family3.familySize() is 5

  val family4 = new FlexibleFamily("Dad",mom="Fred","Harry","Doggy","Rupert","Sebastian")
  family4.familySize() is 6

  val family5 = new FlexibleFamily("Elton", "Rupert")
  family5.familySize() is 2

}
