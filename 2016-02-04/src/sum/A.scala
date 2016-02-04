package sum

// if A is a B or C
sealed trait A

final case class B() extends A

final case class C() extends A
