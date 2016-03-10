// 6

sealed trait DivisionResult

case class Finite(x: Int) extends DivisionResult
case class Infinite() extends DivisionResult

object divide {
  def apply(x: Int, y: Int): DivisionResult = y match {
    case 0 => Infinite()
    case _ => Finite(x / y)
  }
}

divide(1, 2)
divide(1, 0)

divide(4, 2)

def sample(x: Int, y: Int) = divide(x, y) match {
  case Infinite() => "Cannot divide by zero"
  case Finite(result) => s"$x divided by $y is $result"
}

sample(1, 2)
sample(1, 0)

sample(4, 2)