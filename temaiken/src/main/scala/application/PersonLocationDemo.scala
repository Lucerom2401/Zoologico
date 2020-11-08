package application

import domain.Location.{Acuario, Aviario, Terrario}
import domain.Person

object PersonLocationDemo extends App {

  val lucero: Person = Person(
    name = "Lucero",
    location = Terrario()
  )

  println(lucero.showLocation)

  val miguel: Person= Person(
    name= "Miguel",
    location = Acuario()
  )

  val maria: Person= Person (
    name= "Maria",
    location = Aviario()
  )

  val persons= List(lucero,miguel,maria)

  persons.foreach(println)

}
