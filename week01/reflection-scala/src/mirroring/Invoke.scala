package mirroring

import scala.io.StdIn.readLine
import scala.reflect.runtime.universe._


case object Execute {
  def execute(): Unit = {

  }

  def getClassInstance(clsName: String) = {
    val mirror = runtimeMirror(getClass.getClassLoader)
    val cls = mirror.classSymbol(Class.forName(clsName))
    val module = cls.companion.asModule
    mirror.reflectModule(module).instance
  }

  def invokeMethod(meth: String) = {
    val mirror = runtimeMirror(getClass.getClassLoader)
    val im = mirror.reflect(getClassInstance("mirroring.User"))
    //val method = instance.symbol.info.member(TermName(meth)).asMethod
    // invoke method
    //im.reflectMethod(method)
  }
}


object MyApp extends App {
  val reply = readLine("Class to create instance of and execute ? ")
  val meth = readLine("Method to invoke ? ")
  val clsname = "mirroring." + reply + "Thing"
  println("Trying to execute the " + meth + " method of class " + clsname)

  val instance = Execute.getClassInstance(clsname)
  println(instance.getClass)
//  Execute.invokeMethod(instance)
}

case class AddThing() {
  def myMethod() = println("guess it worked")
}