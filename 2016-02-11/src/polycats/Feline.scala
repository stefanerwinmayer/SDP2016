package polycats

sealed trait Feline {
  def dinner: Food
}

final case class Lion() extends Feline {
  def dinner: Food =
    Antelope
}

final case class Tiger() extends Feline {
  def dinner: Food =
    TigerFood
}

final case class Panther() extends Feline {
  def dinner: Food =
    Humans
}

final case class Cat(favouriteFood: String) extends Feline {
  def dinner: Food =
    CatFood(favouriteFood)
}

sealed trait Food

final case object Antelope extends Food

final case object TigerFood extends Food

final case object Humans extends Food

final case class CatFood(food: String) extends Food

