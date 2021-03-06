import scala.annotation.tailrec

def fib(n: Int): BigInt =
  if (n < 2) 1
  else fib(n - 1) + fib(n - 2)

// fib(0) => 1
// fib(1) => 1
// fib(n) => fib(n - 1) + fib(n - 2)

//fib(4) -> fib(3) + fib(2)
//   fib(3) -> fib(2) + fib(1)
//   fib(2) -> fib(1) + fib(0)
// key -> value
// int -> BigInt

def fibrec(n: Int): BigInt = {
  @tailrec
  def fibHelper(x: Int, prev: BigInt = 1, next: BigInt = 1): BigInt =
    x match {
      case 0 => prev
      case 1 => next
      case _ => fibHelper(x - 1, next, next + prev)
    }
  println("Calling fibHelper")
  fibHelper(n)
}

fibrec(4)

fibrec(4)

def memo[X, Y](f: X => Y): X => Y = {
  val cache = collection.mutable.Map[X, Y]()

  (x: X) => {
    (cache get x) match {
      case Some(y) => y
      case None =>
        val y = f(x)
        cache(x) = y
        y
    }
  }
}

//memo {
//  xs: List[Int] =>
//    println("Computing")
//    xs.length
//}
val memolength = memo {
  xs: List[Int] =>
    println("Computing")
    xs.length
}

val l = List(1, 2, 3, 4, 5)

memolength(l)
memolength(l)

val memofib = memo(fibrec)

memofib(4)
memofib(4)
