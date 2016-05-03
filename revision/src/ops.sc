val lst = List(1.0,2.0,3.0,4.0,5.0)

lst.fold(0.0)((x,y) => x + y)

lst.fold(0.0)(_ + _)

lst.reduce(_ + _)

lst./:(1.0)(_ / _)
lst.foldLeft(1.0)(_ / _)


lst.foldRight(1.0)( _ / _)

lst.filter( _ > 3.0).reduce(_ + _)

( 1.0 /: lst) (_ / _)
( lst :\ 1.0) (_ / _)


