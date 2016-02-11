package solutions

class Family(names: String*) {

  def familySize(): Int = {
    var count = 0
    for (i <- names) {
      count = count + 1
    }
    count
  }
}
