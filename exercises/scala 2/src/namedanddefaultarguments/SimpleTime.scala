package namedanddefaultarguments

import com.atomicscala.AtomicTest._

/**
  * Created by stefanm on 15/02/2016.
  */
class SimpleTime(val hours: Int, val minutes: Int) {

}

object Test extends App {
  val t = new SimpleTime(hours=5, minutes=30)
  t.hours is 5
  t.minutes is 30
}