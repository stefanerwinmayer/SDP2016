package solutions

class FlexibleFamily(mom: String, dad: String, kids: String*) {

  def familySize(): Int = {
    var count = 2 // see change!
    for (i <- kids) {
      count = count + 1
    }
    count
  }
}
