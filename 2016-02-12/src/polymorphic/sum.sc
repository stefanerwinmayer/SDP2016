// If Politician is Honest or Corrupt
// method f

sealed trait Politician {
  def pay: Amount
}

final case class Honest() extends Politician {
  def pay: Amount = ???
}

final case class Corrupt() extends Politician {
  def pay: Amount = ???
}

trait Amount
