// 8

sealed trait LinkedList[A] {
  def length: Int = this match {
    case Empty() => 0
    case Pair(head, tail) => 1 + tail.length
  }

  def apply(nth: Int): A = this match {
    case Empty() => throw new Exception("Bad things happened")
    case Pair(head, tail) => if (nth == 0) head else tail(nth - 1)
  }

  def contains(element: A): Boolean = this match {
    case Empty() => false
    case Pair(head, tail) => if (element == head) true else tail.contains(element)
  }
}

case class Pair[A](head: A, tail: LinkedList[A]) extends LinkedList[A]
case class Empty[A]() extends LinkedList[A]

val list: LinkedList[Int] = Pair(1, Pair(2, Pair(3, Empty())))
list.isInstanceOf[LinkedList[Int]] // returns true

list.head
// returns 1 as an Int
list.tail.head // returns 2 as an Int
list.tail.tail // returns Pair(3, Empty()) as a LinkedList[Int]



case class Pair2[A, B](one: A, two: B)
val pair = Pair2[String, Int]("hi", 2)
// returns pair: Pair[String,Int] = Pair(hi,2)
pair.one
// returns res13: String = hi
pair.two
// returns res14: Int = 2