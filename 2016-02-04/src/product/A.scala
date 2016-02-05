package product

// Product type pattern
// A hasa b (with type B) and a c (with type C)

case class B()

case class C()

case class A(b: B, c: C)

//trait A {
//  def b: B
//  def c: C
//}