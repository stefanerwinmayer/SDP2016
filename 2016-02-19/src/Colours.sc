trait Colour
case object Red extends Colour
case object Blue extends Colour

case object Purple extends Colour

val l = Seq("Red", "Blue", "Dog")

val c:Colour = Red

println(c)
