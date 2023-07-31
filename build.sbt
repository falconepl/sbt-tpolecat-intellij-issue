import Dependencies._
import org.typelevel.scalacoptions.ScalacOptions

name := "sbt-tpolecat-intellij-issue"
version := "1.0"
scalaVersion := "2.13.11"

semanticdbEnabled := true
semanticdbVersion := scalafixSemanticdb.revision

Test / tpolecatExcludeOptions += ScalacOptions.warnNonUnitStatement

libraryDependencies += Lib.scalatest
