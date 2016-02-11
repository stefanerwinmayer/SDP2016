package classargs

/**
 * Created by smayer04 on 11/02/2016.
 */
class Family(val names: String*) {

  def familySize() = names.size
}
