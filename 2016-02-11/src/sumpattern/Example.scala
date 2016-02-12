package sumpattern

// If A is B or C, method f returning F

class Example {
  def f(a: A): F =
  a match {
    case B() => ???
    case C() => ???
  }

}

case class A()

case class B() extends A
case class C() extends A
trait F
