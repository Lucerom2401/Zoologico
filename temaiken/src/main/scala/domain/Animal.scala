package domain

import java.util.jar.Attributes.Name

import javax.swing.Spring

trait Animal {}

object Animal {

  sealed trait Mammal extends Animal
  sealed trait Feline extends Mammal

  case class Lion(
      name: String
  ) extends Feline
  case class Tiger(
      name: String
  ) extends Feline

  case class Puma(
      name: String
  ) extends Feline

  case class Delphin(
      name: String
  ) extends Mammal

  sealed trait Bird extends Animal

  case class Pinguin(
      name: String
  ) extends Bird
  case class Guacamaya(
      name: String
  ) extends Bird
  case class Eagle(
      name: String
  ) extends Bird

  sealed trait Reptilian extends Animal

  case class Tortoise(
      name: String
  ) extends Reptilian
  case class Lagarto(
      name: String
  ) extends Reptilian
  case class Crocodile(
      name: String
  ) extends Reptilian

  sealed trait Amphibians extends Animal

  case class Toad(
      name: Spring
  )
  case class Poisonousfrog(
      name: Spring
  )

}
