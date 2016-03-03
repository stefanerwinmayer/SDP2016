package two

class Person(first: String, last: String) {
  val firstName = first
  val lastName = last

  def name = s"${firstName} ${lastName}"
}

object Main extends App {
  val p = new Person("David", "Dodge")
  println(p)
  //p.name = "asdasd"
  println(p.name)
}

