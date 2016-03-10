import scala.Array.{concat, range}

object Arrays {
  def main(args: Array[String]): Unit = {
    val z = new Array[String](3)
    z(0) = "one"
    z(1) = "two"
    z(2) = z(0)

    val zz = Array("one", "two", "three")

    for (x <- zz)
      println(x)

    val yy = concat(z, zz)

    println(yy)

    val myList = range(10, 20, 2)
    myList.map(x => println(x - 1))
  }
}
