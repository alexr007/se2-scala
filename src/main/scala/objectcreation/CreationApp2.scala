package objectcreation

import java.time.LocalDateTime

object CreationApp2 {

  case class AddressFrom(value: String)
  case class AddressTo(value: String)
  case class SmokingAllowed(value: Boolean)
  case class PetsAllowed(value: Boolean)

  case class TaxiOrder(
      from: AddressFrom,
      to: AddressTo,
      when: LocalDateTime,
      price: Double,
      smokingAllowed: SmokingAllowed,
      petsAllowed: PetsAllowed)

  val order: TaxiOrder = TaxiOrder(
    AddressFrom("NewYork"),
    AddressTo("Kyiv"),
    LocalDateTime.parse("2020-10-10 13:15"),
    500d,
    SmokingAllowed(false),
    PetsAllowed(true),
  )

  val f: AddressFrom = order.from

}
