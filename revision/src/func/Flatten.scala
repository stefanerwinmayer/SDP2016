package func

object Flatten extends App {
  def flatten(lst: List[_]): List[Any] = lst match {
    case Nil => Nil
    case (head: List[_]) :: tail => flatten(head) ::: flatten(tail)
    case head :: tail => head :: flatten(tail)
  }

  val lst = List(1, 2, List(3, 5, List(34,6),8), 12, List(6, 7))
  println(lst)
  println(flatten(lst))
}
