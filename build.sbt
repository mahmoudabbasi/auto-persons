name := """auto-persons"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.10.4"

libraryDependencies ++= Seq(
  jdbc,
  cache,
  ws//,
  //"org.scalatestplus.play" %% "scalatestplus-play" % "1.5.1" % Test
)

