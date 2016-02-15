package namedanddefaultarguments

import com.atomicscala.AtomicTest._

/**
  * Created by stefanm on 15/02/2016.
  */
class SimpleTime2(val hours: Int, val minutes: Int = 0) {

}

object Test2 extends App {
  val t2 = new SimpleTime2(hours=10)
  t2.hours is 10
  t2.minutes is 0
}
