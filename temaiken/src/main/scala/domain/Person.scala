package domain

case class Person(
    name: String,
    location: Location
) {
  def showLocation = s"The person $name is in $location"
}

object Person {}
