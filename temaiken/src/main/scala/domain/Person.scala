package domain

object Person {

  case class Person(
  name: String,
  location: Location,
  genre : Genre,
  age :Age
  )
  trait Genre
  case object Male extends Genre
  case object Female extends Genre

  case class  Age (age:Int
                   )


}




