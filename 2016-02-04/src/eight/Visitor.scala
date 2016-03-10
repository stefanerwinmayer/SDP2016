package eight

import java.util.Date

trait Visitor {
  def id: String

  // unique id
  def createdAt: Date // date first visited site

  def age: Long = new Date().getTime - createdAt.getTime
}

case class Anonymous(id: String, createdAt: Date = new Date()) extends Visitor

case class User(id: String, email: String, createdAt: Date = new Date()) extends Visitor

object Main extends App {
  val a = Anonymous("anon1")
  println(a.createdAt)
}