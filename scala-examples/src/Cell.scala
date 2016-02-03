trait Cell {
  def save(x: Int)

  def retrieve
}

class StandardCell(protected var state: Int) extends Cell {
  override def save(x: Int) = state = x

  override def retrieve = state
}

trait Similar {
  def isSimilar(x: Int): Boolean

  def isNotSimilar(x: Int): Boolean = !isSimilar(x)
}

object CellMain extends App {
  val cell = new StandardCell(3)
    with Similar {
    override def isSimilar(x: Int) = state == x
  }
}