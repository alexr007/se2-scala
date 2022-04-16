package objectcreation

import java.time.LocalDateTime

object CreationApp {

  case class TaxiOrder(
      from: String,
      to: String,
      when: LocalDateTime,
      price: Double,
      smokingAllowed: Boolean,
      petsAllowed: Boolean)

  val order: TaxiOrder = TaxiOrder(
    from = "NewYork",
    to = "Kyiv",
    LocalDateTime.parse("2020-10-10 13:15"),
    500d,
    smokingAllowed = false,
    petsAllowed = true,
  )

}
