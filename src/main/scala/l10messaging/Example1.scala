package l10messaging

trait User

trait AuthService {
  def getCredentials(u: User): List[String]
}
trait AuthService2 {
  def doNext(u: User): Unit
}

object ExampleMicroService {
  val authService: AuthService = ???
  val user: User = ???

  // ...
  val cred: List[String] = authService.getCredentials(user)
  // ...

}

object ExampleMessaging {
  val authService: AuthService2 = ???
  val user: User = ???

  // ...
  authService.doNext(user)
  // ...

}
