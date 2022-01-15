package new_lang

import java.util.UUID

case class Person(id: UUID, name: String, age: Int, knowledge: List[String])

object CityLight extends App {

  val p = Person(UUID.randomUUID(), "Jim", 33, List("Java", "Scala"))
  val p34 = p.copy(age = 34)

  trait Light
  case class Red() extends Light
  case class Green() extends Light
  case class Yellow(isBlinking: Boolean) extends Light

  def doSomething(l: Light) = l match {
    case Green()            => println("The color is Green")
    case Red()              => println("The color is Red")
    case Yellow(isBlinking) => println(s"The color is Yellow ${isBlinking}")
  }

  doSomething(Red())
  doSomething(Yellow(true))
  doSomething(Yellow(false))

}
