val l = List(1,2,3,4,5)

l map (x => x * 2)

//trait Option
//case class Some(x: Object) extends Option
//case object None extends Option

def f(x: Int) =
  if (x > 2) Some(x) else None

l map (x => f(x))

def g(x: Int)= List(x-1,x,x+1)

g(3)

l map (x => g(x))

l flatMap(x => g(x))

l map (x => f(x))

l flatMap(x => f(x))

l filter(x => x < 2)

val lst = List(7,8,9)
l.length
lst.length

val res = l zip lst
val zero = 0
val one = 1
res.tail.head._2

l reduce ((x,y) => (x + y))
l reduce ((x,y) => (x * y))

l.fold(zero)((x:Int,y:Int) => (x + y))
l.fold(one)((x:Int,y:Int) => (x * y))



