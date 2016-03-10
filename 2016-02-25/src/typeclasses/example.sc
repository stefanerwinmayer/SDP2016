import scala.math.Ordering

implicit val maxOrdering = Ordering.fromLessThan[Int]{_ > _ }
val minOrdering = Ordering.fromLessThan[Int]{_ < _ }


List(3,4,2).sorted(maxOrdering)
List(3,4,2).sorted

