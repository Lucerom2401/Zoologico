package domain

import domain.Person.

trait Location {

}
object Location {
  case class Terrario() extends Location
  case class Acuario() extends Location
  case class Aviario() extends Location
  case class Restroom (
                    name: String,
                    genre: String ) extends Location
 case class Money()
  case class Taquilla (money: Money ) extends Location

  case object Cafeteria extends Location




}