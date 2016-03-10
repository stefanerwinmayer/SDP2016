package genericsFunc

trait LinkedList[A] {
  //  <: Number
  // [A >: Number] oops not java.lang.Number as that is not supertype of Scala Int

  //  def length: Int =
  //    this match {
  //      case End => 0
  //      case Pair(hd, tl) => 1 + tl.length
  //    }
  //
  //  def double: IntList =
  //    this match {
  //      case End => End
  //      case Pair(hd, tl) => Pair(hd * 2, tl.double)
  //    }

  // FOLD pattern

  def abstraction[B](end: B, f: (A,B) => B): B =
    this match {
      case End() => end
      case Pair(hd, tl) => f(hd, tl.abstraction(end,f))
    }

  def length: Int =
    abstraction(0, (_,tl) => 1 + tl)

//  def sum: Int =
//    abstraction(0, (hd,tl) => hd + tl)
//
//  def product: Int =
//    abstraction(1, (hd,tl) => hd * tl)
}

case class End[A]() extends LinkedList[A]

case class Pair[A](head: A, tail: LinkedList[A]) extends LinkedList[A]
