import com.atomicscala.AtomicTest._

// 1a
val v = Vector(1, 2, 3, 4)
v.map(n => n + 1) is Vector(2, 3, 4, 5)

v.map(n => n * 11 + 10) is Vector(21, 32, 43, 54)

// 1b
//v.foreach(n => n * 11 + 10) is Vector(21, 32, 43, 54)
// Not possible - for each does not return a new Vector

// 1c
val result1 = for (n <- v) yield n * 11 + 10
result1 is Vector(21, 32, 43, 54)

// 2
val result2 = for (n <- v) yield n + 1
result2 is Vector(2, 3, 4, 5)

// 3
val v2 = Vector(1, 10, 100, 1000)
v2.reduce((sum, n) => sum + n) is 1111

var total = 0
val result3 = for (n <- v2) total += n
total is 1111

// 4

def sumIt(numbers: Int*) = {
  numbers.reduce((sum, n) => sum + n)
}

sumIt(1, 2, 3) is 6
sumIt(45, 45, 45, 60) is 195
