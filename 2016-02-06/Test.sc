trait Base {
  def meth: String
}


case class Child() extends Base {
  def meth: String = "any thing we want"
  def anotherMeth: Int = 3 + 4
}

object MyMain extends App {
  def c: Base = Child()
  c.meth
}

def c: Base = Child()
c.meth