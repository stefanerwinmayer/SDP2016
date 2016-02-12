package product

// If A has a b of type B and a c of type C and
// method f returns an F
case class Example(b: B, c: C) {
  def f: F = ???
}

trait B
trait C
trait F