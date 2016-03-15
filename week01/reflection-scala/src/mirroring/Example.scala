package mirroring

import scala.reflect.runtime.universe._

object Example {
  def getObjectInstance(clsName: String) = {
    val mirror = runtimeMirror(getClass.getClassLoader)
    val module = mirror.staticModule(clsName)
    mirror.reflectModule(module).instance
  }

  def getClassInstance(clsName: String) = {
    val mirror = runtimeMirror(getClass.getClassLoader)
    val cls = mirror.classSymbol(Class.forName(clsName))
    val module = cls.companion.asModule
    mirror.reflectModule(module).instance
  }

  def invokeMethod(path: String, meth: String) = {
    val mirror = runtimeMirror(getClass.getClassLoader)
    val im = mirror.reflect(getObjectInstance(path))
    val method = im.symbol.typeSignature.member(TermName(meth)).asMethod
    im.reflectMethod(method).apply()
  }
}

object User {
  override def toString():String  = "Here we go..."
  def myMethod():String = "this is the result of invoking myMethod on User"
}

case class Another()

object MyMain extends App {
  val x = Example.getObjectInstance("mirroring.User")
  println(x)
  val y = Example.getClassInstance("mirroring.Another")
  println(y)

  val z = Example.invokeMethod("mirroring.User", "myMethod")
  println(z)
}