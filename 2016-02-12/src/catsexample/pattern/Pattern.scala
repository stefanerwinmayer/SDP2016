package catsexample.pattern

sealed trait Cat {
  def eat: Food =
    this match {
      case Lion() => Antelope
      case Tiger() => TigerFood
      case Panther() => Human
      case Garfield => Lasagne
      case DomesticCat(favFood) => CatFood(favFood)
    }
}

object Diner {
  def eat(cat: Cat): Food =
    cat match {
      case Lion() => Antelope
      case Tiger() => TigerFood
      case Panther() => Human
      case Garfield => Lasagne
      case DomesticCat(favFood) => CatFood(favFood)
    }
}


final case class Lion() extends Cat

final case class Tiger() extends Cat

final case class Panther() extends Cat

final case object Garfield extends Cat

final case class DomesticCat(favouriteFood: String) extends Cat

sealed trait Food

final case object Lasagne extends Food

final case object Antelope extends Food

final case object TigerFood extends Food

final case object Human extends Food

final case class CatFood(food: String) extends Food
