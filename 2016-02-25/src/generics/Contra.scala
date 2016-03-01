package generics

trait Person

class Student() extends Person {
  override def toString() = this.getClass.toString
}

class Academic() extends Person

case class TA() extends Student

object Main extends App {
  def foo[T](s: T): T = {
    s
  }

  val s = new Student
  val a = new Academic
  val ta = new TA

  println(foo(s))

  println(foo(ta))
}