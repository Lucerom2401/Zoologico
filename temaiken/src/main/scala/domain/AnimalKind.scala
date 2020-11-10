package domain

trait AnimalReference
trait AnimalKind extends AnimalReference

object AnimalKind {

  case class Animal(
      name: String,
      kind: AnimalKind
  ) extends AnimalReference

  sealed trait Mammal extends AnimalKind

  sealed trait Feline extends Mammal
  case object Lion extends Feline
  case object Tiger extends Feline
  case object Puma extends Feline

  case object Delphin extends Mammal

  sealed trait Bird extends AnimalKind
  case object Pinguino extends Bird
  case object Guacamaya extends Bird
  case object Eagle extends Bird

  sealed trait Reptilian extends AnimalKind
  case object Tortoise extends Reptilian
  case object Lagarto extends Reptilian
  case object Crocodile extends Reptilian

  sealed trait Amphibians extends AnimalKind
  case object Toad extends Amphibians
  case object PoisonousFrog extends Amphibians

}
