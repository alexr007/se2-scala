package new_lang

object Implicits extends App {

  final class WhatEver(val n: Int)
  val we = new WhatEver(42)

  // (natural) approach 1
  class MyClass(we: WhatEver) {
    def printMe = println(s"The value is ${we.n}")
  }
  val my = new MyClass(we)
  my.printMe

  // (Scala approach)
  implicit class WhatEverWithExtendedSyntax(we: WhatEver) {
    def printMe = println(s"The value is ${we.n}")
  }

  WhatEverWithExtendedSyntax(we).printMe
  // Scala automatically wrap
  we.printMe

  val x = 1.+(1)
  val y = "a".+("b")
  val map: Map[Int, String] = Map(1 -> "a", 2 -> "b") + (3 -> "c")
  val set: Set[Int] = Set(1, 2, 3) + 4

  case class Order(lines: Int, total: Double)

  object OrderSyntax {
    implicit class Syntax1(o: Order) {
      def +(o2: Order) = Order(o.lines + o2.lines, o.total + o2.total)
    }
  }

  val o1 = Order(10, 100.5)
  val o2 = Order(5, 30.7)

  import OrderSyntax._

  val o3 = o1 + o2 //  Order(15, 131.2)
  println(o3)

}

/** serialize(a: A): String deserialize(s: String): Option[A]
  *
  *   - f: HttpRequest => HttpResponse
  *   - server: Stream[HttpRequest]
  *   - server.map(f)
  */
