// if Car hasa b type Petrol and c type Electric
// method f returns F

case class Car(p: Petrol, e: Electric){
  def f: HybridEngine = ???
}

trait Petrol
trait Electric
trait HybridEngine