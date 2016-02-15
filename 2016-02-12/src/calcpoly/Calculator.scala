package calcpoly

sealed trait Expression {
  def eval: Double
}

final case class Addition(left: Expression, right: Expression) extends Expression {
  def eval: Double = left.eval + right.eval
}

final case class Subtraction(left: Expression, right: Expression) extends Expression {
  def eval: Double = left.eval - right.eval
}

final case class Number(value: Double) extends Expression  {
  def eval: Double = value
}

