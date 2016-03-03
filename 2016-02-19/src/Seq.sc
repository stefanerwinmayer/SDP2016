val s = List(1,2,3)
//s._1
//s._2

def fun() = (1, "ashdahsd")

println(fun()._1)

val t = (1,Seq(2,3,4,5,6,7,8,9,10))
t._2

val v = List("a","b","c","d")

// map
// flatmap
// filter
// reduce -> fold
// zip

//def square(x:Int) = x * x
def square = (x:Int) => x * x
(x:Int) => x * x

s map (square)

val lst = List(s,s)

//lst flatMap ((x:Int) => (x * x))










