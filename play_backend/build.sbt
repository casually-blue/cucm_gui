name := """CUCMAdmin"""
version := "1.0"
scalaVersion := "2.13.6"
organization := "org.coramdeoacademy"

libraryDependencies += guice
libraryDependencies += "javax.xml.ws" % "jaxws-api" % "2.3.1"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

Compile / doc / sources := Seq.empty
Compile / packageDoc / publishArtifact := false

WsdlKeys.packageName := Some("org.coramdeoacademy.cucm")