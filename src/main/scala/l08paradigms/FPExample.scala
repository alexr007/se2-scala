package l08paradigms

object FPExample extends App {

  def printMessage1(message: String) =
    println(message)

  def printMessage2(message: String) =
    () => println(message)

  val m1 = printMessage2("hello")
  val m2 = printMessage2("world")
  val m3: () => Unit = () => {
    m1()
    m2()
  }
  m3()

}
