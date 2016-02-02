import com.atomicscala.AtomicTest._

// 1
val vector1 = Vector(3, 6, 4, 34)
val vector2 = Vector("a", "the", "from", "towards")
val vector3 = Vector(6.4, 8.5, 9.4, 3.1)

// 2
val vectorCollection = Vector(vector1, vector2, vector3)

// 3
val stringVector = Vector("The", "dog", "visited", "the", "fire", "station")
var sentence = ""
for (word <- stringVector) {
  println(word)
  sentence += word + " "
}
sentence.toString() is "The dog visited the fire station "

// 4
val intVector = Vector(5, 4, 7, 9)
val doubleVector = Vector(4.3, 6.7, 2.8, 7.9)

intVector.sum
intVector.min
intVector.max

doubleVector.sum
doubleVector.min
doubleVector.max

// 5
val myVector1 = Vector(1, 2, 3, 4, 5, 6)
val myVector2 = Vector(1, 2, 3, 4, 5, 6)
myVector1 is myVector2


