package new_lang

object Recursion extends App {

  def sum(xs: List[Int]): Int =
    if (xs.isEmpty) return 0
    else return xs.head + sum(xs.tail)

  def sum2(xs: List[Int]): Int =
    if (xs.isEmpty) 0
    else xs.head + sum2(xs.tail)

  def sum3(xs: List[Int]): Int = xs match {
    case Nil => 0
    case ::(head, tail) =>
      head + sum3(tail)
  }

  // def Nil (xs: List[Int]): Boolean
  // def :: (xs: List[Int]): (Int, List[Int])
  def sum4(xs: List[Int]): Int = xs match {
    case Nil => 0
    case head :: tail =>
      val h @ _: Int = head
      val t @ _: List[Int] = tail

      head + sum4(tail)
  }

  /*
  List(1,2,3)
  -------
  head = 1
  tail = List(2,3)
  -------
  head = 2
  tail = List(3)
  -------
  head = 3
  tail = Nil
  -------
  Nil
  =======
  1
  List(2,3)
  r: 1 + sum(List(2,3))
  -------
  2
  List(3)
  r: 1 + 2 + sum(List(3)
  --------
  ....
  --------
  r: 1 + 2 + 3 + 0


   */

  class Person {
    def >>(x: Int) = ???
  }

}
