lazy val root = (project in file("."))
  .settings(name := "Advent of Code Scala")
  .settings(moduleName := "advent_of_code_scala")
  .settings(version := "0.1")
  .settings(scalaVersion := "2.13.5")
  .settings(libraryDependencies ++= dependencies)

lazy val dependencies = Seq("org.scalatest" %% "scalatest"   % "3.2.3"  % Test)

scalacOptions ++= Seq("-deprecation", "-feature")