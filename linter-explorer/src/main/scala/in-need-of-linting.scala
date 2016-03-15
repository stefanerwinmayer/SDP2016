object BadCode extends App {

  val option:Option[String] = None

  val boom = option.get

  val boom1 = option.head

  val list:List[Int] = List()

  val boom2 = list.head

  val boom3 = list.tail

  val eek = {} + ""

  val eek1 = 1.asInstanceOf[Option[Unit]]

  val eek2 = null




}