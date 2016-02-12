package treepoly

sealed trait Tree {
  def sum: Int

  def double: Tree
}

final case class Node(l: Tree, r: Tree) extends Tree {
  def sum: Int =
    l.sum + r.sum

  def double: Tree =
    Node(l.double, r.double)
}

final case class Leaf(item: Int) extends Tree {
  def sum: Int = item

  def double: Tree = Leaf(item * 2)
}

object TreeMain extends App {
  val t: Tree = Node(Node(Leaf(3), Leaf(4)), Node(Leaf(3), Leaf(4)))
  println(t)
  println(t.sum)
  println(t.double)
}
