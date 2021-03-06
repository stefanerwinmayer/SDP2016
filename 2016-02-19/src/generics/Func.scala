package generics

trait IntList {
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

  def abstraction(end: Int, f: (Int,Int) => Int): Int =
  this match {
    case End => end
    case Pair(hd, tl) => f(hd, tl.abstraction(end,f))
  }

  def length: Int =
    abstraction(0, (_,tl) => 1 + tl)

  def sum: Int =
    abstraction(0, (hd,tl) => hd + tl)

  def product: Int =
    abstraction(1, (hd,tl) => hd * tl)
}

case object End extends IntList

case class Pair(head: Int, tail: IntList) extends IntList
