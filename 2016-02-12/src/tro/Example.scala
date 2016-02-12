package tro

import scala.annotation.tailrec

object Example {
  def method1: Int = 1

//  @tailrec
  def method2: Int = method1       // tail call

  def method3: Int = method1 + 2   // not a tail call
}
