package application

import domain.Animal
import domain.Animal.Tiger
import domain.Location._
import domain.Person._

object ZooworkerDemo extends App {

  val lucero: Person = Person(
    name = "Lucero",
    location = Terrario(),
    age = Age(21),
    genre = Female
  )

  val tigreAlex = Tiger("Alex")
  val luceroZooworker = Zooworkers(
    name = lucero.name,
    homework = "No hace nada",
    isInChargeOf = Animal.Tiger("Alex")
  )

  val horasDelDia = Seq(
    "10 AM",
    "11 AM",
    "12 AM",
    "1 PM",
    "2 PM",
    "3 PM",
    "4 PM",
    "5 PM"
  )

  val cosasQueHizoLucero = horasDelDia map {
      case "10 AM" => luceroZooworker.copy(homework = "Va a alimentar a los leones")
      case "11 AM" =>
        luceroZooworker.copy(homework =
          "Sigue alimentando a los leones. Miguel comienza a sospechar que esta jugando con los leones."
        )
      case "12 AM" => luceroZooworker.copy(homework = "Se va a comer")
      case _ => luceroZooworker.copy("No trabaja a esas horas!")
    }

  cosasQueHizoLucero.foreach(println)

}
