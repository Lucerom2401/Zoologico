package application

import domain.Location.Terrario
import domain.Person

object PersonLocationDemo extends App {

  val lucero: Person = Person(
    name = "Lucero",
    location = Terrario()
  )

  println(lucero.showLocation)
}
