package catsexample

sealed trait Feline
final case class Lion() extends Feline
final case class Tiger() extends Feline
final case class Panther() extends Feline
final case class Cat(FavouriteFood: String) extends Feline

sealed trait Food
final case object Antelope extends Food
final case object TigerFood extends Food
final case object Humans extends Food
final case class CatFood(food: String) extends Food

