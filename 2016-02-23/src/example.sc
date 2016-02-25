trait Person
class Student extends Person
class Academic extends Person
class TA extends Student

def foo[T](s: T): T = {
  s
}

val s = new Student
val a = new Academic
val ta = new TA

foo(s)

foo(ta)