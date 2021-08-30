
ThisBuild / scalaVersion     := "2.12.10"
ThisBuild / version          := "0.1.0-SNAPSHOT"
ThisBuild / organization     := "com.example"
ThisBuild / organizationName := "example"

scalacOptions ++= Seq("-Xlint")

lazy val IntegrationTest = config("it") extend(Runtime)
lazy val selenium = "org.scalatestplus" %% "selenium-3-141" % "3.2.9.0"
lazy val flatspec = "org.scalatest" %% "scalatest-flatspec" % "3.2.9"
lazy val shouldMatchers = "org.scalatest" %% "scalatest-shouldmatchers" % "3.2.9"
lazy val root = (project in file("."))
  .configs(IntegrationTest)
  .settings(
    Defaults.itSettings,
    name := "MUnitTest",
    libraryDependencies ++= Seq(
        "org.scalameta" %% "munit" % "0.7.28" % "test,it",
        "org.scalactic" %% "scalactic" % "3.2.9",
        selenium % "it",
        flatspec % "it",
        shouldMatchers % "it"
    )
  )

// See https://www.scala-sbt.org/1.x/docs/Using-Sonatype.html for instructions on how to publish to Sonatype.
