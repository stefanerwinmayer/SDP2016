trait Family {
  type M <: Mother
  type F <: Father
  type C <: Child

  class Father(val name: String) {
    def kiss(m: M) =
      println("Showing signs of affection towards " + m.name)
  }

  class Mother(val name: String)

  class Child(val name: String) {
    def askForhelp(m: M) = println("Screeaaaaming at " + m.name)
  }

}

object UpperClassFamily extends Family {
  override type F = Father;
  override type M = Mother;
  override type C = PoliteChild

  class Mother(name: String, val lastName: String) extends super.Mother(name)

  class PoliteChild(name: String) extends Child(name) {
    override def askForhelp(m: M) =
      println("Asking " + m.name + m.lastName + " for help")
  }

}

object StandardFamily extends Family {
  override type F = Father;
  override type M = Mother;
  override type C = Child
}

object Test extends App {

  val father = new StandardFamily.Father("John")
  val upperClassMother = new UpperClassFamily.Mother("Dorthea III", "XXX")

  def assignFamily(f: Family) = ()
  //father.kiss(upperClassMother) // illegal!
  println(father)
  println(upperClassMother)
}