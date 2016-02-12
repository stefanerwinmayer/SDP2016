// A has a b: B AND c: C
// method f returning F

def f(a: A): F =
  a match {
    case A(b,c) => ???
  }

case class A(b: B, c: C)

trait B
trait C
trait F

