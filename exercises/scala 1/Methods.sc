// 1
def getSquare(x: Int) = x * x
val a = getSquare(3)
assert(a == 9)
val b = getSquare(6)
assert(b == 36)
val c = getSquare(5)
assert(c == 25)

// 2
def isArg1GreaterThanArg2(x: Double, y: Double) = x > y
val t1 = isArg1GreaterThanArg2(4.1, 4.12)
assert(!t1)
val t2 = isArg1GreaterThanArg2(2.1, 1.2)
assert(t2)

// 3
def manyTimesString(word: String, x: Int) = word * x
val m1 = manyTimesString("abc", 3)
assert("abcabcabc" == m1, "Should be 'abcabcabc")
val m2 = manyTimesString("123", 2)
assert("123123" == m2, "Should be '123123")

