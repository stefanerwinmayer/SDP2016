package generics.example

trait Item

trait PlasticItem extends Item

trait PlasticBottle extends PlasticItem

trait PaperItem extends Item

trait Newspaper extends PaperItem

class TrashCan[T] {                     // List[+T] Array[T]
  // .. don't worry about implementation yet
}

object Main extends App {
  def setTrashCanForPlastic(gc: TrashCan[PlasticItem]): Unit = {
    // sets trash can for PlasticItem items
  }

  // contravariant subtyping
  //  setTrashCanForPlastic(new TrashCan[Item])

  // invariant
  //setTrashCanForPlastic(new TrashCan[PlasticItem])

  // covariant
  //setTrashCanForPlastic(new TrashCan[PlasticBottle])
}