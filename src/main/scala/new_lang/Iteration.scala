package new_lang

object Iteration extends App {

  val xs: List[Int] = List(1, 2, 3, 4, 5)

  var sum = 0
  xs.foreach(x => sum = sum + x)

  val sum2 = xs.foldLeft(0)((a, x) => a + x)

  val xs2: List[Int] = xs.map(x => x + 10)
  val xs5: List[Int] = xs.map(_ + 10)

  val xs3: List[Int] = xs :+ 33 // O(N)
  val xs4: List[Int] = 33 +: xs // O(1)

  val t1: (Int, Boolean) = (1, true)
  val t2: (Int, String, Double) = (1, "Jim", 3.15)

  //                          min  max
  def minMax(xs: List[Int]): (Int, Int) =
    xs.foldLeft((Int.MaxValue, Int.MinValue)) { case ((oldMin, oldMax), x) =>
      (oldMin min x, oldMax max x)
    }

  val r: (Int, Int) = minMax(List(1, 2, 3, 4, 5, 10))
  val min = r._1
  val max = r._2

  val (min2, max2) = minMax(List(1, 2, 3, 4, 5, 10))
  println()

  val times10 = (x: Int) => x * 10

  val xs6: List[Int] = xs map times10 map times10
  println(xs6) // List(100, 200, 300, 400, 500)
}
