package application

import domain.Location._
import domain.Person._

object PersonLocationDemo extends App {

  val lucero: Person = Person(
    name = "Lucero",
    location = Terrario(),
    age = Age(21),
    genre = Female
  )

  val miguel: Person = Person(
    name = "Miguel",
    location = Acuario(),
    age = Age(25),
    genre = Male
  )

  val maria: Person = Person(
    name = "Maria",
    location = Aviario(),
    age = Age(21),
    genre = Female
  )

  val mathias: Person = Person(
    name = "Mathias",
    location = Cafeteria,
    age = Age(21),
    genre = Male
  )

  val juan: Person = Person(
    name = "Juan",
    location = Restroom(id = "Terarrio", genre = Male),
    age = Age(28),
    genre = Male
  )
  val persons = List(lucero, miguel, maria, mathias, juan)

  persons.foreach(println)

}
