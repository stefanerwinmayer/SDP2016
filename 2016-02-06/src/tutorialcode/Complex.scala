package tutorialcode

class Complex(real: Double, imaginary: Double) {
  override def toString() =
    "" + re + (if (im < 0) "" else "+") + im + "i"

  def re = real

  def im = imaginary
}