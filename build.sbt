name := "play-jongo"
organization := "io.github.lucassklp"
description := "Play 2.6.x Module for Jongo http://jongo.org/"
version := "2.2.1-jongo1.5"
scalaVersion := "2.12.5"
githubOwner := "lucassklp"
githubRepository := "play-jongo"


libraryDependencies ++= Seq(
  "org.mongodb" % "mongo-java-driver" % "3.12.10",
  "org.jongo" % "jongo" % "1.5.0",
  "com.fasterxml.jackson.module" %% "jackson-module-scala" % "2.8.9" % "optional",
  "org.assertj" % "assertj-core" % "3.22.0" % Test
)

lazy val root = (project in file(".")).enablePlugins(PlayJava)

javacOptions ++= Seq("-source", "1.8", "-target", "1.8", "-encoding", "UTF-8")

// "-v" needed for more verbose output, otherwise only the number of tests is reported
Test / testOptions := Seq(Tests.Argument(TestFrameworks.JUnit, "-v"))

// Maven publishing info
publishMavenStyle := true

Test / publishArtifact := false

pomIncludeRepository := { _ => false }
