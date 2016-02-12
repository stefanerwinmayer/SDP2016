package poly

sealed trait A {
  def foo: String = "It's a A!"
}

final case class B() extends A {
  override def foo: String = "It's a B!"
}

final case class C() extends A {
  override def foo: String = "It's a C!"
}

object TestMyPoly extends App {
  val anA: A = B()
  println(anA.foo)
  val anotherA = C()
  println(anotherA.foo)
}

