package solutions

object SquareThem {
  def squareThem(x: Int*): Int = {
    var square = 0
    for (i <- x) {
      square = square + i * i
    }
    square
  }
}