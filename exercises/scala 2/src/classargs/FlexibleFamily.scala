package classargs

/**
 * Created by smayer04 on 11/02/2016.
 */
class FlexibleFamily (val parent1: String, val parent2: String, val children: String*) {
  def familySize() = 2 + children.size
}
