trait Fruit

case class Apple() extends Fruit

case class Orange() extends Fruit

val l1: List[Apple] = Apple() :: Nil
val l2: List[Fruit] = Orange() :: l1

// and also, it's safe to prepend with "anything",
// as we're building a new list - not modifying the
// previous instance

l2 :: List(3)
//val l3: List[Fruit] = 3 :: l2

val l4: List[AnyRef] = "" :: l2


//val a: Array[Any] = Array[Int](1, 2, 3)

