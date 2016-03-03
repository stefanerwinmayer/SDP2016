
final case class Box[A](value: A)

Box(2)

Box("asdhakjdh")

Box(2).value

def orig[A](a: A) = a

orig(3)
orig("asd")

// Invariant Generic Sum Type Pattern
trait Result[A]
case class Success[A](result:A) extends Result[A]
case class Failure[A](reason: String) extends Result[A]

//sealed trait LinkedList[A]
//final case class End[A]() extends LinkedList[A]
//final case class Pair[A](head: A, tail: LinkedList[A]) extends LinkedList[A]



