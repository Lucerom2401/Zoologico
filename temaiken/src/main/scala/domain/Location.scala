package domain

import domain.Person.Genre

trait Location

object Location {
  case class Terrario() extends Location
  case class Acuario() extends Location
  case class Aviario() extends Location
  case class Restroom(
      id: String,
      genre: Genre
  ) extends Location
  trait Money
  case object Cash extends Money
  case object Card extends Money
  case object Coupon extends Money

  case class RevenuenCheckpoint(money: Money) extends Location

  case object Cafeteria extends Location

}
