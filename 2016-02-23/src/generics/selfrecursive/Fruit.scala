package generics.selfrecursive

// naive impl, Fruit is NOT self-recursively parameterised

// In the naive implementation, since the trait Fruit has no clue about
// the types extending it, so it’s not possible to restrict the compareTo signature
// to only allow "the same subclass as `this`" in the parameter.

trait Fruit {
  final def compareTo(other: Fruit): Boolean = true
  // impl doesn't matter in our example, we care about compile-time
}

case class Apple() extends Fruit

case class Orange() extends Fruit

object MyMain extends App {
  val apple = new Apple()
  val orange = new Orange()

  apple compareTo orange // compiles, but we want to make this NOT compile!
}