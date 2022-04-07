package l03errors

object ErrorHandling extends App {

  def toIntDefault(s: String): Option[Int] =
    try {
      Option(s.toInt)
    } catch {
      case _: Exception => None
    }

  def toIntSmart(s: String): Either[Exception, Int] =
    try {
      Right(s.toInt)
    } catch {
      case x: Exception => Left(x)
    }

  val r1: Either[Exception, Int] = toIntSmart("123")
  val r2: Either[Exception, Int] = toIntSmart("abc")

  val r: String = r1.fold(
    x => s"here is the exception: ${x.getMessage}",
    i => s"here is the result: $i",
  )
  println(r)
  println(r1)
  println(r2)

}
