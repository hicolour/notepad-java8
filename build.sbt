organization  := "com.prochera"

name := "notepad-java8"

version := "0.1-SNAPSHOT"

scalaVersion := "2.11.4"

val akkaVersion = "2.3.7"

compileOrder in Compile := CompileOrder.JavaThenScala

libraryDependencies ++= Seq(
  // akka
  "com.typesafe.akka" %% "akka-actor" % akkaVersion,
  "com.typesafe.akka" %% "akka-persistence-experimental" % akkaVersion,
  "com.typesafe.akka" %% "akka-cluster" % akkaVersion,
  "com.typesafe.akka" %% "akka-contrib" % akkaVersion,
  "com.typesafe.akka" %% "akka-stream-experimental" % "1.0-M2",
  // util
  "com.typesafe.scala-logging" %% "scala-logging-slf4j" % "2.1.2",
  "ch.qos.logback" % "logback-classic" % "1.1.2",
  //test scala
  "org.scalatest" % "scalatest_2.11" % "2.2.1" % "test",
  //junit tests on sbt
  "com.novocode" % "junit-interface" % "0.11" % "test",

  //test junit
  "junit" % "junit" % "4.11",
  // mockiing
  "org.mockito" % "mockito-all" % "1.9.5",
  "org.easymock" % "easymock" % "3.1",

  // Matchers
  "org.easytesting" % "fest-assert" % "1.4",
  "org.hamcrest" % "hamcrest-all" % "1.3",

  // Test utls
  "com.jayway.awaitility" % "awaitility" % "1.6.3",


  "joda-time" % "joda-time" % "2.5",
  "org.joda" % "joda-convert" % "1.7"
)
