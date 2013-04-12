import sbt._
import sbt.Keys._

object SnsDriverBuild extends Build {

  lazy val twitterextract = Project(
    id = "snsdriverbuild",
    base = file("."),
    settings = Project.defaultSettings ++ Seq(
      name := "SnsDriver",
      organization := "com.amazonaws.services.snspubsub",
      version := "0.1-SNAPSHOT",
      scalaVersion := "2.9.2",
      resolvers += "Typesafe Releases" at "http://repo.typesafe.com/typesafe/releases",
      libraryDependencies += "com.typesafe.akka" % "akka-actor" % "2.0.1",
      libraryDependencies += "com.amazonaws" % "aws-java-sdk" % "1.4.1"
            
    )
  )
}
