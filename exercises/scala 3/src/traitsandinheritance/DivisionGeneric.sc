// 10

sealed trait Maybe[A]

case class Full[A](value: A) extends Maybe[A]
case class Empty[A]() extends Maybe[A]

object divide {
  def apply(x: Int, y: Int): Maybe[Int] = y match {
    case 0 => Empty[Int]()
    case _ => Full[Int](x / y)
  }
}

divide(1, 2)
divide(1, 0)

divide(4, 2)

def sample(x: Int, y: Int) = divide(x, y) match {
  case Empty() => "Cannot divide by zero"
  case Full(result) => s"$x divided by $y is $result"
}

sample(1, 2)
sample(1, 0)

sample(4, 2)