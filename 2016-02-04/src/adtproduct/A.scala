package adtproduct

trait B

trait C

class A(b: B, c: C) {

}

// or

trait At {
  def b: B

  def c: C
}
