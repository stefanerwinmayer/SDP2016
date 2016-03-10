val l = List(1, 2, 3, 4)
val m = List(6, 7, 9, 11)

//def square(x: Int): Int = x * x

def square = (x : Int) => x * x

l.map(square)
l.map((x: Int) => x * x)
l.map(x => x * x)

val x = Seq()

x.map(x => x)

def f(x: Int): Option[Int] =
  if (x > 2) Some(x) else None

l.map(x => f(x))

l zip m

def g(v: Int) = List(v-1, v, v+1)

g(3)

l.map(x => g(x))

l.flatMap(x => g(x))

l.map(x => f(x))
l.flatMap(x => f(x))