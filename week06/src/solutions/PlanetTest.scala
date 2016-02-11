package solutions

class Planet(val name: String, val description: String, val moons: Int = 1) {
  def hasMoon = if (moons > 0) true else false
}

object PlanetTest {
  val p = new Planet(name = "Mercury",
    description = "small and hot planet",
    moons = 0)
}