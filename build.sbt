name := "Zoologico"

version := "0.1"

scalaVersion := "2.13.3"

lazy val global = project
  .in(file("."))
  .settings(
    name := "Zoologico"
  )
  .aggregate(
    temaiken
  )

lazy val temaiken = project
  .settings(
    name := "temaiken"
  )
