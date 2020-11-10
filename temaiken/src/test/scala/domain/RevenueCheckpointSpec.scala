package domain

import application.HorasTrabajadas.conseguirLasHorasQueTrabajoLuceroHoy
import application.ZooworkerDemo.{tigreAlex, HoraDelDia}
import domain.AnimalKind.{Animal, Pinguino, Tiger}
import domain.Person.Zooworkers

import collection.mutable.Stack
import org.scalatest._
import flatspec._
import matchers._

class RevenueCheckpointSpec extends AnyFlatSpec with should.Matchers {
  val tigreAlex = Animal("Alex", kind = Tiger)

  "El tigre" should "se llama Alex" in {
    assert(tigreAlex.name == "Alex")
  }

  "Lucero" should "only work 8 hours a day" in {
    assert(conseguirLasHorasQueTrabajoLuceroHoy() == 8)
  }

}
