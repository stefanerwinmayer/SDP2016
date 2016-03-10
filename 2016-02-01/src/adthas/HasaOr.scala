package adthas

trait A {
  def d: D
}

sealed trait D

final case class B() extends D

final case class C() extends D
