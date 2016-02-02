package six

case class Person(firstName: String, lastName: String = "Person")

object Main extends App {
  val p = new Person("Fred", "Jones")
  println(p)
  val q = Person("Mario", "Kart")
  println(q)
  println(Person("Mike"))
}
