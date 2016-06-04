((x: Int, y: Int, z: Int) => x + y + z)(2,3,4)

val aName = (x: Int, y: Int, z: Int) => x + y + z

aName(2,3,4)

(() => 3)()

// example of closure
var b = 3

val anotherName = ((x:Int, y:Int) => x + y + b)

anotherName(3,4)

b = 5

anotherName(3,4)
