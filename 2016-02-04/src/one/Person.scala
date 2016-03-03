package one

class Person {
  val firstName = "Steve"
  val lastName = "Jobs"

  override def toString() = s"${firstName} ${lastName}"
}

object Main extends App {
  val p = new Person
  println(p)
}

