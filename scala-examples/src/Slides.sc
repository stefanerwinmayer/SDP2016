val func: (Int, Int) => Int =
  (a: Int, b: Int) =>
    (a + b) / 2

func(1, 3) // returns 2

def createAdder(num: (Int) => Int) =
  (input: Int) => input + num(input)

val plus2 = createAdder(a => a + 1)

plus2(10) // returns 21


def twice(f1: (Int) => Int) =
  (input: Int) => f1(f1(input))

val funca = twice(a => a * 2 + 1)

funca(10) // returns 43

case class Box[A](value: A)

val box1 = Box("Oswald Cat")
val box2 = Box(12345)

val str: String = box1.value
val num: Int    = box2.value


def twicegen[A](f: (A) => A) =
  (input: A) => f(f(input))

val exclaim = twicegen((a: String) => a + "!")

exclaim("Hello") // returns "Hello!!"

def andThen(f1: (Int) => Int, f2: (Int) => Int) =
  (input: Int) => f2(f1(input))

val both = andThen(a => a + 1, a => a * 2)

both(10) // returns 22
