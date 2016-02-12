package ll

import scala.annotation.tailrec

sealed trait IntList

final case object End extends IntList

final case class Pair(head: Int, tail: IntList) extends IntList

object MyMain extends App {
  Pair(1, Pair(2, Pair(3, End)))

  val d = End
  val c = Pair(3, d)
  val b = Pair(2, c)
  val a = Pair(1, b)

  println(sumnon(a))
  println(sum(a))

  //a.tail
  //a.head

  // Not tail recursive as needs to do something on return
  def sumnon(list: IntList): Int =
    list match {
      case End => 0
      case Pair(head, tail) => head + sum(tail)
    }

  @tailrec
  def sum(list: IntList, total: Int = 0): Int =
    list match {
      case End => total
      case Pair(hd, tl) => sum(tl, total + hd)
    }
}