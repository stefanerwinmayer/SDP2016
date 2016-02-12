package productpattern

// If A has a b of type B and a c of type C and
// method f returns an F

class Example {
  def f(a: A): F =
  a match {
    case A(b,c) => ???
  }

}

case class A(b: B, c: C)
trait B
trait C
trait F
