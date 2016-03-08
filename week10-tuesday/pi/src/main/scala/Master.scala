import akka.actor.{Actor, ActorRef, Props}
import akka.routing.RoundRobinRouter

import scala.concurrent.duration._


class Master(nrOfWorkers: Int, nrOfMessages: Int, nrOfElements: Int, listener: ActorRef)
  extends Actor {

  var pi: Double = _
  var nrOfResults: Int = _
  val start: Long = System.currentTimeMillis

  val workerRouter = context.actorOf(
    Props[Worker].withRouter(RoundRobinRouter(nrOfWorkers)), name = "workerRouter")

  //  var router = {
  //    val routees = Vector.fill(5) {
  //      val r = context.actorOf(Props[Worker])
  //      context watch r
  //      ActorRefRoutee(r)
  //    }
  //    Router(RoundRobinRoutingLogic(), routees)
  //  }

  def receive = {
    case Calculate ⇒
      for (i ← 0 until nrOfMessages) workerRouter ! Work(i * nrOfElements, nrOfElements)

    case Result(value) ⇒
      pi += value
      nrOfResults += 1
      if (nrOfResults == nrOfMessages) {
        // Send the result to the listener
        listener ! PiApproximation(pi, duration = (System.currentTimeMillis - start) millis)
        // Stops this actor and all its supervised children
        context stop self
      }
  }

}