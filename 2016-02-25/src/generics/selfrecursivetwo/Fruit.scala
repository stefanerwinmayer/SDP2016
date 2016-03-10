package generics.selfrecursivetwo

// Notice the Type Parameter in Fruit’s signature.
// You could read it as "I take some T, that T must be a Fruit[T]",
// and the only way to satisfy such bounds is by extending this trait as we do with Apple and Orange now.
// Now if we’d try comparing apple to orange we’ll get a compile time error.

trait Fruit[T <: Fruit[T]] {           // <: === extends // >: === super
  final def compareTo(other: Fruit[T]): Boolean = true // impl doesn't matter in our example
}

class Apple()  extends Fruit[Apple]
class Orange() extends Fruit[Orange]

object Main extends App {

  val apple = new Apple
  val orange = new Orange
  val bloodredorange = new Orange

  orange compareTo bloodredorange

  //orange compareTo apple


}