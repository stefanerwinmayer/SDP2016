sealed trait A {
  def fun: String
}

final case class B() extends A {
  def fun: String =
    "This is a B"
}

final case class C() extends A {
  def fun: String =
    "This is a C"
}

val a: A = B()

val aa: A = new B()

val aaa: A = B.apply()

val aaaa: A = C()

a.fun
aaa.fun
aaaa.fun

