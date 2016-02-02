// 1

import com.atomicscala.AtomicTest._

class Cup {
  var percentFull = 0
  val max = 100
  def add(increase:Int):Int = {
    percentFull += increase
    if(percentFull > max) {
      percentFull = max
    } else if (percentFull < 0) {
      percentFull = 0
    }
    percentFull // Return this value
  }
  def set(percentFull: Int) = this.percentFull = percentFull
  def get() = percentFull
}

//val cup = new Cup
//cup.add(45) is 45
//cup.add(-15) is 30
//cup.add(-50) is -20

// These tests are satisfied

// 2
//val cup = new Cup
//cup.add(45) is 45
//cup.add(-55) is 0
//cup.add(10) is 10
//cup.add(-9) is 1
//cup.add(-2) is 0

// 3
//cup.percentFull = 56
//cup.percentFull is 56

//
val cup = new Cup
cup.set(56)
cup.get() is 56