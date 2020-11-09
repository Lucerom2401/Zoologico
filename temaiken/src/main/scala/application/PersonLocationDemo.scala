package application

import domain.Location.{Acuario, Aviario, Terrario,Restroom,Taquilla,Cafeteria}
import domain.Person.{Person,Sex, Years}

object PersonLocationDemo extends App {

  val lucero: Person = Person(
    name = "Lucero",
    location = Terrario()
  )

  println(lucero.showLocation)

  val miguel: Person= Person(
    name= "Miguel",
    location = Acuario(),
    sex=,
    years = 18

  )

  val maria: Person= Person (
    name= "Maria",
    location = Aviario()

  )

  val mathias: Person= Person (
    name= "Mathias",
    location= Cafeteria,

  )

  val juan: Person= Person (
    name= "Juan",
    location = Restroom,
    genre= ???,
    years = ???
  )
  val persons= List(lucero,miguel,maria,mathias,juan)

  persons.foreach(println)

}
