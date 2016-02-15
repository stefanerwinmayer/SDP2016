package treepm

sealed trait Tree

final case class Node(l: Tree, r: Tree) extends Tree

final case class Leaf(val i: Int) extends Tree

object TreeFuncs {
  def sum(tree: Tree): Int =
    tree match {
      case Leaf(item) => item
      case Node(l, r) => sum(l) + sum(r)
    }

  def double(tree: Tree): Tree =
    tree match {
      case Leaf(item) => Leaf(item * 2)
      case Node(l, r) => Node(double(l),double(r))
    }
}

object TreeMain extends App {
  val t: Tree = Node(Node(Leaf(3),Leaf(4)),Node(Leaf(3),Leaf(4)))
  println(t)
  println(TreeFuncs.sum(t))
  println(TreeFuncs.double(t))
}