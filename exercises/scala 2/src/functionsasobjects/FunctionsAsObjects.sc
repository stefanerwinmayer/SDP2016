import com.atomicscala.AtomicTest._

// 20
var str = ""
Vector(1, 2, 3, 4).foreach(x => str += x + ",")
str is "1,2,3,4,"

// 21
val dogYears = (year: Int) => year * 7
dogYears(10) is 70

// 22
var s = ""
val v = Vector(1, 5, 7, 8)
v.foreach(year => s += dogYears(year) + " ")
s is "7 35 49 56 "

// 23
var s2 = ""
val numbers = Vector(1, 2, 5, 3, 7)
numbers.foreach(x => s2 += x * x + " ")
s2 is "1 4 25 9 49 "