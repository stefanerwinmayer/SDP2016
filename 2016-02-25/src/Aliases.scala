object Aliases extends App {
  type User = String
  type Age = Int

  // Map[String,Int]

  val data:  Map[User, Age] =  Map.empty



  trait SimpleContainer {
    type A      // Abstract Type Member

    def value: A
  }

  case class IntContainer() extends SimpleContainer {
    type A = Int
    def value = 42
  }

  case class StringContainer() extends SimpleContainer {
    type A = String
    def value = "fred"
  }

  println(IntContainer().value)
  println(StringContainer().value)
}