package new_lang

import java.util.UUID

case class Person2(name: String, age: Int, knowledge: List[String] = Nil, id: UUID = UUID.randomUUID())

object Unapply extends App {

  val p = Person2("Jim", 33)

  if (p.age >= 18) ()
  if (p.name.contains("A")) ()

  var result: Unit = p match {
    case IsKid(name)        => println(s"Hello, $name") // Unit
    case IsAdult(age, name) => println(s"Welcome to Night club, $name ($age)")
    case IsSmart(p)         => println(s"Your are the best, $p")
    case somethingElse      => println(somethingElse)
  }

  var result2: Either[Person2, String] = p match {
    case IsKid(name)        => Right(s"Hello, $name")
    case IsAdult(age, name) => Right(s"Welcome to Night club, $name ($age)")
    case IsSmart(p)         => Right(s"Your are the best, $p")
    case somethingElse      => Left(somethingElse)
  }

  object IsKid {
    def unapply(p: Person2): Option[String] =
      Option.when(p.age < 10)(p.name)
  }

  object IsAdult {
    def unapply(p: Person2): Option[(Int, String)] =
      if (p.age >= 18) Some((p.age, p.name)) else None
  }

  object IsSmart {
    def unapply(p: Person2): Option[Person2] =
      if (p.knowledge.contains("Scala")) Some(p) else None
  }

  val r: String = if (5 > 3) "wooHoo" else "bad"

  val nothing: Unit = ()

  val r2: Any = if (5 > 3) "wooHoo" // ()

//  A => B
//  A => Unit

}
