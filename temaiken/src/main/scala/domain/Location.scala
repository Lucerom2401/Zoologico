package domain

trait Location {

}
object Location {
  case class Terrario() extends Location
  case class Acuario() extends Location
  case class Aviario() extends Location


}