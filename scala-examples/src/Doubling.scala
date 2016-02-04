trait Doubling extends Cell {
  abstract override def save(x: Int) = super.save(2 * x)
}

trait Max extends Cell {
  abstract override def save(x: Int) =
    if (x > 10)
      throw new Exception("overflow!")
    else
      super.save(x)
}

object DoublingMain extends App {
  val cell = new StandardCell(3) with Doubling with Max
  cell.save(2)
}