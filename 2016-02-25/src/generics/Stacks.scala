//package generics
//
//class Stack[+A] {
//  def push[B >: A](elem: B): Stack[B] = new Stack[B] {
//    override def top: B = elem
//
//    override def pop: Stack[B] = Stack.this
//
//    override def toString() = elem.toString() + " " +
//      Stack.this.toString()
//  }
//
//  def top: A = sys.error("no element on stack")
//
//  def pop: Stack[A] = sys.error("no element on stack")
//
//  override def toString() = ""
//}
//
//// try changing Person for Student as the generic type
//// try changing it to Any to see what happens
//
//object VariancesTest extends App {
//  var s: Stack[Person] = new Stack().push(new Student);
//  s = s.push(new Academic)
//  //s = s.push(new Object())
//  //s = s.push(7)
//  println(s)
//}
//
//trait Person
//case class Student() extends Person
//case class Academic() extends Person