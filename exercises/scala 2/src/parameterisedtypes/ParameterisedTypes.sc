import com.atomicscala.AtomicTest._

// Return type is inferred:
def inferred(c1: Char, c2: Char, c3: Char) = {
  Vector(c1, c2, c3)
}

// Explicit return type:
def explicit(c1: Char, c2: Char, c3: Char): Vector[Char] = {
  Vector(c1, c2, c3)
}

inferred('a', 'b', 'c') is "Vector(a, b, c)"
explicit('a', 'b', 'c') is "Vector(a, b, c)"

def explicitDouble(d1: Double, d2: Double, d3: Double): Vector[Double] = {
  Vector(d1, d2, d3)
}

explicitDouble(1.0, 2.0, 3.0) is Vector(1.0, 2.0, 3.0)

def explicitList(vector: Vector[Double]): List[Double] = {
  vector.toList
}

explicitList(Vector(10.0, 20.0)) is List(10.0, 20.0)
explicitList(Vector(1, 2, 3)) is List(1.0, 2.0, 3.0)

def explicitSet(vector: Vector[Double]): Set[Double] = {
  vector.toSet
}

explicitSet(Vector(10.0, 20.0, 10.0)) is Set(10.0, 20.0)
explicitSet(Vector(1, 2, 3, 2, 3, 4)) is Set(1.0, 2.0, 3.0, 4.0)