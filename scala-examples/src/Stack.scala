// T i s a type parameter

class Stack[T] {
  private var elems: List[T] = Nil

  def push(x: T) {
    elems = x :: elems
  }

  def top: T = elems.head

  def pop() {
    elems = elems.tail
  }

  def exists(p: T => Boolean) =
    elems.exists(p)
}