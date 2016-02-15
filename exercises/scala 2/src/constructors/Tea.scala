package constructors

import com.atomicscala.AtomicTest._

/**
  * Created by stefanm on 15/02/2016.
  */
class Tea(name: String = "Earl Grey",
          decaf: Boolean = false,
          sugar: Boolean = false,
          milk: Boolean = false) {


  def describe = {
    var description = name
    if (decaf) description += " decaf"
    if (milk) description += " + milk"
    if (sugar) description += " + sugar"
    description
  }

  def calories = {
    var calories = 0;
    if (sugar) calories += 16
    if (milk) calories += 100
    calories
  }
}

object TeaScript extends App {
  val tea = new Tea
  tea.describe is "Earl Grey"
  tea.calories is 0
  val lemonZinger = new Tea(decaf = true, name="Lemon Zinger")
  lemonZinger.describe is "Lemon Zinger decaf"
  lemonZinger.calories is 0
  val sweetGreen = new Tea( name="Jasmine Green", sugar=true)
  sweetGreen.describe is "Jasmine Green + sugar"
  sweetGreen.calories is 16
  val teaLatte = new Tea(sugar=true, milk=true)
  teaLatte.describe is "Earl Grey + milk + sugar"
  teaLatte.calories is 116
}


