val both = andThen(
  (a: Int) => a * 2.5,
  (a: Double) => "the answer is " + a)

def andThen[A, B, C](f1: (A) => B, f2: (B) => C) =
  (input: A) => f2(f1(input))

both(3) // returns "the answer is 7.5"
