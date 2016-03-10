// A has a b with type B and a c with type C

// Product Type Pattern

trait B

trait C

trait A {
  def b: B

  def c: C
}

//case class B()
//case class C()
//case class A(b:B, c: C)