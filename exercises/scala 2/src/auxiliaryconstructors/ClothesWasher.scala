package auxiliaryconstructors

import com.atomicscala.AtomicTest._

/**
  * Created by stefanm on 15/02/2016.
  */
class ClothesWasher(val modelName: String, val capacity: Double) {
  def this(modelName: String) = this(modelName, 6.0)

  def this(capacity: Double) = this("Generic", capacity)
}

class ClothesWasher2(val modelName: String = "Generic", val capacity: Double = 6.0) {

}

object ClothesWashterText extends App {
  val auxiliaryWasher1 = new ClothesWasher("Miele", 5.0)
  auxiliaryWasher1.modelName is "Miele"
  auxiliaryWasher1.capacity is 5.0

  val defaultWasher1 = new ClothesWasher2("Miele", 5.0)
  defaultWasher1.modelName is "Miele"
  defaultWasher1.capacity is 5.0

  val auxiliaryWasher2 = new ClothesWasher("Bosch")
  auxiliaryWasher2.modelName is "Bosch"
  auxiliaryWasher2.capacity is 6.0

  val defaultWasher2 = new ClothesWasher2("Bosch")
  defaultWasher2.modelName is "Bosch"
  defaultWasher2.capacity is 6.0

  val auxiliaryWasher3 = new ClothesWasher(4.0)
  auxiliaryWasher3.modelName is "Generic"
  auxiliaryWasher3.capacity is 4.0

  val defaultWasher3 = new ClothesWasher2(capacity = 4.0)
  defaultWasher3.modelName is "Generic"
  defaultWasher3.capacity is 4.0
}

