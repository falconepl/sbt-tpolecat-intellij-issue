sbt-tpolecat-intellij-issue
===========================

`sbt-tpolecat-intellij-issue` is a project that demonstrates an issue with:
```sbt
Test / tpolecatExcludeOptions += ScalacOptions.warnNonUnitStatement
```
being applied properly for a standalone sbt compilation, but not for the compilation in IntelliJ IDEA. In turn, that can cause compilation errors such as:
```sbt
unused value of type org.scalatest.Assertion (add `: Unit` to discard silently)
```
only in IntelliJ (but not in the standalone sbt)

## Steps to reproduce

If we comment out/remove:
```sbt
Test / tpolecatExcludeOptions += ScalacOptions.warnNonUnitStatement
```
from `build.sbt` file and reload sbt shell (`reload` command), then the compilation fails both in sbt and IntelliJ IDEA (as expected) with the following error:
```sbt
[error] /.../sbt-tpolecat-intellij-issue/src/test/scala/intellijissue/MainTest.scala:9:7: unused value of type org.scalatest.Assertion (add `: Unit` to discard silently)
[error]     1 shouldEqual 1
[error]       ^
[error] No warnings can be incurred under -Werror.
```
However, if `Test / tpolecatExcludeOptions` is defined, the compilation succeeds only in sbt - it still fails in IntelliJ IDEA with the same error as before

## Environment

This issue was reproduced in the following environment:
```
IntelliJ IDEA version: 2023.2
Scala plugin version: 2023.2.17
JVM version: Temurin OpenJDK 17.0.8+7
OS: macOS 13.5
```
