val scalatest = "3.0.5"

lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "scalalearn",
      scalaVersion := "2.11.6"
    )),
    name := "example"
  )

libraryDependencies += "org.scalatest" %% "scalatest" % scalatest

libraryDependencies += "junit" % "junit" % "4.11" % "test"

libraryDependencies += "log4j" % "log4j" % "1.2.17"