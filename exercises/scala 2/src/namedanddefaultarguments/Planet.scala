package namedanddefaultarguments

import com.atomicscala.AtomicTest._

/**
  * Created by stefanm on 15/02/2016.
  */
class Planet(name: String, description: String, moons: Int = 0) {
  def hasMoon = moons > 0
}

object TestPlanet extends App {
  val p = new Planet(name = "Mercury",
    description = "small and hot planet", moons = 0)
  p.hasMoon is false

  val earth = new Planet(moons = 1, name = "Earth",
    description = "a hospitable planet")
  earth.hasMoon is true
}
