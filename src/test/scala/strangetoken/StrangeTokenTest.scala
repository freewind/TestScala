package strangetoken

import org.specs2.mutable._
import scala.strangetoken.StrangeToken

object StrangeTokenTest extends Specification {

  "id decoder" should {
    "get the decoded id with length of 15" in {
      val token = StrangeToken.decode()
      token.length must be equalTo 15
    }
  }

}
