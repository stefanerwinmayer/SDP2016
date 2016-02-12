package matchcats

sealed trait Feline {
  def dinner: Food =
    this match {
      case Lion() => Antelope
      case Tiger() => TigerFood
      case Panther() => Humans
      case Cat(favouriteFood) => CatFood(favouriteFood)
    }
}

object Diner {
  def dinner(feline: Feline): Food =
    feline match {
      case Lion() => Antelope
      case Tiger() => TigerFood
      case Panther() => Humans
      case Cat(favouriteFood) => CatFood(favouriteFood)
    }
}

final case class Lion() extends Feline

final case class Tiger() extends Feline

final case class Panther() extends Feline

final case class Cat(FavouriteFood: String) extends Feline

sealed trait Food

final case object Antelope extends Food

final case object TigerFood extends Food

final case object Humans extends Food

final case class CatFood(food: String) extends Food

