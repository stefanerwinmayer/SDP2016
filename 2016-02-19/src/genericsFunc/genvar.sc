sealed trait Option[+A]
final case class Some[A](value:A) extends Option[A]
final case object None extends Option[Nothing]

// look at type hierarchy in Scala -> Any at the top
// and Nothing at the bottom

val x: Option[Int] = Some(3)
val y: Option[Int] = None

//case class Foo[+A]()
//
//trait B
//case class A() extends B

// A is only an A - invariant
// +A convariant  plus subtypes
// -A contravariant plus supertypes

trait Atype
trait Btype
trait Ctype

def fun = (a:Atype) => a
def fun2 = (a:Atype, b:Btype) => b
def fun3 = (a:Atype, b:Btype, c: Ctype) => c

trait Function0[+R] {
  def apply: R
}

trait Function1[-A, +B]{
  def apply(a: A): B
}

trait Function2[-A, -B, +C]{
  def apply(a: A, b: B): C
}

