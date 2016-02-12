sealed trait IntList

final case object End extends IntList

final case class Pair(head: Int, tail: IntList) extends IntList

Pair(1, Pair(2, Pair(3, End)))

val d = End
val c = Pair(3, d)
val b = Pair(2, c)
val a = Pair(1, b)

println(a)

a.tail
a.head

def sum(list: IntList): Int =
  list match {
    case End => 0
    case Pair(head,tail) => head + sum(tail)
  }