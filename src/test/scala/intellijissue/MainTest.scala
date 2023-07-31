package intellijissue

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

final class MainTest extends AnyFlatSpec with Matchers {

  it should "pass basic test" in {
    1 shouldEqual 1
    2 shouldEqual 2
  }

}
