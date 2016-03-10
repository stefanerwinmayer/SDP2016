package three

class Person(val firstName: String, val lastName: String) {
  def name = s"${firstName} ${lastName}"
}

object Main extends App {
  val p = new Person("David", "Dodge")
  println(p)
  //p.name = "asdasd"
  println(p.name)
}
