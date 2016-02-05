package four

class Person(val firstName: String, val lastName: String) {
  def greet(firstName: String = "Steve", lastName: String = "Strange") =
    s"Greetings ${firstName} $lastName"
}

object Main extends App {
  val p = new Person(lastName = "David", firstName = "Dodge")
  println(p.greet())
  println(p.greet("Max", "Hole"))
  println(p.greet("James"))
  println(p.greet(lastName = "Murdoch"))
}
