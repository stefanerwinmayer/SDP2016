// if A isa B or C


def f(a: A): F =
  a match {
    case B() => ???
    case C() => ???
  }

trait A
case class B() extends A
case class C() extends A
trait F