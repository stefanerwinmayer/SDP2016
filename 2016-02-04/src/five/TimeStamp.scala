package five

class TimeStamp(val seconds: Long)

object TimeStamp {
  def apply(hours: Int = 1, minutes: Int = 1, seconds: Int = 1): TimeStamp =
    new TimeStamp(hours * 60 * 60 + minutes * 60 + seconds)
}

object Test extends App {
  val t = TimeStamp() // equiv TimeStamp.apply()
  println(t.seconds)
  val t2 = TimeStamp(1, 1, 1) // TimeStamp.apply(1,1,1)
  println(t2.seconds)
  println(t2)
}
