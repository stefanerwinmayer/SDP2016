// "has-a or" pattern
// A has-a B or C

sealed trait D

trait AAAA {
  def d: D
}

final case class B() extends D

final case class C() extends D

//sealed trait AAAA
//final case class DDDD(b: B) extends A
//final case class EEEE(c: C) extends A
