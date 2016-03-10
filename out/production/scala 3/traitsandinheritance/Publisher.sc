trait Publication

class Book(val l  ength: Int, val author: Int) extends Publication with Manuscript
class Periodical(val editor: String, val issues: Seq[Issue]) extends Publication

class Issue(val volume: Int, val issue: Int, manuscripts: Seq[Manuscript])

trait Manuscript {
  val length: Int
  val author: String
}



