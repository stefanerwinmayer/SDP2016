name := "Ray Tracer original codebase"

version := "1.0"

scalaVersion := "2.11.8"

resolvers += "Akka Snapshot Repository" at "http://repo.akka.io/snapshots/"

libraryDependencies += "com.typesafe.akka" %% "akka-actor" % "2.4.1"

scalacOptions ++= Seq("-unchecked", "-deprecation", "-feature")
