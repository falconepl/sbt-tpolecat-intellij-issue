import sbt._

object Dependencies {

  object Ver {
    val scalatest = "3.2.16"
  }

  object Lib {
    val scalatest = "org.scalatest" %% "scalatest" % Ver.scalatest % Test
  }

}
