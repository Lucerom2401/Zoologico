package application

import domain.AnimalKind._
import domain.Location._
import domain.Person._

object ZooworkerDemo extends App {

  val lucero: Person = Person(
    name = "Lucero",
    location = Terrario(),
    age = Age(21),
    genre = Female
  )

  val tigreAlex = Animal("Alex", kind = Tiger)
  val luceroZooworker = Zooworkers(
    name = lucero.name,
    homework = "No hace nada",
    isInChargeOf = Animal("Alex", kind = Tiger),
    location = Terrario()
  )

  case class HoraDelDia(hora: String)
  val horasDelDia = Seq(
    HoraDelDia("10 AM"),
    HoraDelDia("11 AM"),
    HoraDelDia("12 AM"),
    HoraDelDia("1 PM"),
    HoraDelDia("2 PM"),
    HoraDelDia("3 PM"),
    HoraDelDia("4 PM"),
    HoraDelDia("5 PM")
  )

  val cosasQueHizoLucero: Seq[Zooworkers] = horasDelDia map {
      case HoraDelDia("10 AM") => luceroZooworker.copy(homework = "Va a alimentar a los leones")
      case HoraDelDia("11 AM") =>
        luceroZooworker.copy(homework =
          "Sigue alimentando a los leones. Miguel comienza a sospechar que esta jugando con los leones."
        )
      case HoraDelDia("12 AM") => luceroZooworker.copy(homework = "Se va a comer")
      case _ => luceroZooworker.copy("No trabaja a esas horas!")
    }

  cosasQueHizoLucero.foreach(println)

}
