class Foo {
  var state = 1

  def printState() = println(this.state)
}

object Foo {
  def invokeFunction(f: () => Unit) = f()

  def main(args: Array[String]) {
    val foo: Foo = new Foo
    val f: (() => Unit) = foo.printState
    foo.state = 2
    invokeFunction(f)
    foo.state = 3
    invokeFunction(f)
  }
}