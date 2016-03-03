package seven

case class Person(firstName: String, lastName: String)

object Stormtrooper {
  def inspect(p: Person): String =
    p match {
      case Person("Luke", "Skywalker") => "Take the money!!! = no lines"
      case Person("Han", "Solo") => "You're good!"
      case Person(first, _) => s"Move along $first"
    }
}

object Main extends App {
  println(Stormtrooper.inspect(Person("James", "Blunt")))
  println(Stormtrooper.inspect(Person("Han", "Solo")))
}