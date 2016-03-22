

val xss = List(List(1, List(6,7), 2), List(3, 4))

def flatten(lst: List[_]): List[Any] = lst match {
  case Nil => Nil
  case (head: List[_]) :: tail => flatten(head) ::: flatten(tail)
  case head :: tail => head :: flatten(tail)
}

flatten(xss)

// boundary condition empty list => empty list
// list consisting of a head item that is a list itself
// list consisting of a head which is not a list


List(1) :: List(List(2),List(3))
List(1,2) ::: List(3,4)

val xyz = List("a", 3, "list", "of", List("strange"), "strings")

flatten(xyz)

List().headOption




