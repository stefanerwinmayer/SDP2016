val lst = List(1.0,2.0,3.0,4.0,5.0,3.0)

lst.fold(0.0)((x,y) => x + y)

lst.fold(0.0)(_ + _)

lst.reduce(_ + _)

lst.filter(_ > 3.0).reduce(_ + _)

lst.filter( _ > 6.0).reduceOption(_ + _)

lst.filter(_ > 6.0).sum

lst :: lst // cons
lst ::: lst // append
lst.map(x => x * x)
//lst.map(_ => _ * _)

lst.zip(lst)

def f(x: Double) = if (x > 2.0) Some(x) else None

lst.map(x => f(x))
lst.flatMap(x => f(x))

def g(v: Double) = List(v-1, v, v+1)

g(3)

lst.map(x => g(x))
lst.flatMap(x => g(x))

val m = Map(1 -> 2, 2 -> 4, 3 -> 6)

m.toList
val t = m.head

t._1
t._2

lst./:(1.0)(_ / _)
lst.foldLeft(1.0)(_ / _)

lst.foldRight(1.0)( _ / _)
lst.:\(1.0)(_ / _)

1 + 3
1.+(3)

( 1.0 /: lst) (_ / _)
( lst :\ 1.0) (_ / _)
