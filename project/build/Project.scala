import sbt._

class Sbert(info: ProjectInfo) extends DefaultProject(info)
{
  val specs = "org.scala-tools.testing" % "specs" % "1.5.0"
  val junit = "junit" % "junit" % "4.4"
  val check = "org.scala-tools.testing" % "scalacheck" % "1.6"
}
