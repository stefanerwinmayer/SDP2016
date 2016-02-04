trait Channel {
  def send(x: String) = println(x)
}

object LogAspect {

  trait LogAfter extends Channel {
    // before advice
    abstract override def send(x: String) = {
      log();
      super.send(x)
    }
  }

  trait LogBefore extends Channel {
    // after advice
    abstract override def send(x: String) = {
      super.send(x);
      log()
    }
  }

  def log() = println("logging!")
}

object TestAspect {
  def main(args: Array[String]) = {
    val channel = new Channel with LogAspect.LogBefore
    channel.send("message")
  }
}
