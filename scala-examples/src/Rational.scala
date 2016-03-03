// Constructor parameters

class Rational(n: Int, d: Int) {
  require(d != 0)
  val numer = n / g
  val denom = d / g
  // Immutable f i e l d s
  private val g = gcd(n.abs, d.abs)
  // Method de f ini t ion

  def +(that: Rational): Rational =
    new Rational(
      numer * that.denom + that.numer * denom,
      denom * that.denom
    )

  // Method de f ini t ion

  def *(that: Rational): Rational =
    new Rational(numer * that.numer, denom * that.denom)

  override def toString = numer + "/" + denom

  private def gcd(a: Int, b: Int): Int =
    if (b == 0) a

    else gcd(b, a % b)
}

