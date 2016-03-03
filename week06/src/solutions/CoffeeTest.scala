package solutions

class Coffee(val shots: Int = 2,
             val decaf: Int = 0,
             val milk: Boolean = false,
             val toGo: Boolean = false,
             val syrup: String = "") {
  var result = ""
  println(caf, decaf, milk, toGo, syrup)

  def getCup(): Unit = {
    if (toGo) {
      result += "ToGoCup "
    }
    else {
      result += "HereCup "
    }
  }

  def caf() = shots - decaf

  def pourShots(): Unit = {
    for (s <- 0 until shots) {
      if (decaf > 0) {
        result += "decaf shot "
      }
      else {
        result += "shot "
      }
    }
  }

  def addMilk(): Unit = {
    if (milk) {
      result += "milk "
    }
  }

  def addSyrup(): Unit = {
    result += syrup
  }

  getCup()
  pourShots()
  addMilk()
  addSyrup()
}

object CoffeeTest extends App {
  val doubleHalfCaf = new Coffee(shots = 2, decaf = 1)
  val tripleHalfCaf = new Coffee(shots = 3, decaf = 2)
}
