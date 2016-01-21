object MastermindDriver {
  def main(args: Array[String]) {
    var g: Game = Factory.getInstance(classOf[Game], true)
    g.runGames
    g = Factory.getInstance(classOf[Game], false)
    g.runGames
  }
}