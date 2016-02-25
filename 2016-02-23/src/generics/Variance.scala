trait Item

trait PlasticItem extends Item

trait PlasticBottle extends PlasticItem

trait PaperItem extends Item

trait Newspaper extends PaperItem

class GarbageCan[A] {
  // .. don't worry about implementation yet
}

object Main extends App {
  def setGarbageCanForPlastic(gc: GarbageCan[PlasticItem]): Unit = {
    // sets garbage can for PlasticItem items
  }

  // contravariant subtyping
  //  setGarbageCanForPlastic(new GarbageCan[Item])

  // invariant
  //  setGarbageCanForPlastic(new GarbageCan[PlasticItem])

  // covariant
  //  setGarbageCanForPlastic(new GarbageCan[PlasticBottle])
}