val cup = new Cup

class Cup {
  val max = 100
  var percentFull = 0

  def add(increase: Int): Int = {
    percentFull += increase
    if (percentFull > max) {
      percentFull = max
    }
    percentFull // Return this value
  }
}

import java.io.FileWriter

import scala.language.implicitConversions

class AtomicTest[T](val target: T) {
  val errorLog = "_AtomicTestErrors.txt"

  def is(expected: String) = tst(expected) {
    expected.replaceAll("\r\n", "\n") == str
  }

  def is[E](expected: E) = tst(expected) {
    expected == target
  }

  def tst[E](expected: E)(test: => Boolean) {
    println(target)
    if (test == false) {
      val msg = "[Error] expected:\n" +
        expected
      println(msg)
      val el = new FileWriter(errorLog, true)
      el.write(target + msg + "\n")
      el.close()
    }
  }

  def beginsWith(exp: String) = tst(exp) {
    str.startsWith(
      exp.replaceAll("\r\n", "\n"))
  }

  def str = // Safely convert to a String
    Option(target).getOrElse("").toString
}

object QuestionMark {
  val fred = 3 //> fred  : Int = 3
  assert(square(2.0) == 4.0)
  assert(square(3.0) == 9.0)
  assert(square(-2.0) == 4.0)

  def square(value: Double): Double =
    value * value //> square: (value: Double)Double

  {
    45
    43
    45
    67
  } //> res0: Int = 67

  if (false) "hello" //> res1: Any = ()
}

import AtomicTest._

object AtomicTest {
  implicit def any2Atomic[T](target: T) =
    new AtomicTest(target)
}
cup.add(45) is 45
cup.add(-15) is 30
cup.add(-50) is -20