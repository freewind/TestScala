package scala.strangetoken

import scala.util.{Success, Try}
import org.apache.commons.codec.binary.Base64

class IdDecoder {

  def decode(token: String): Option[String] = {
    if (token.isEmpty)
      None
    else
      Try(new String(Base64.decodeBase64(token.getBytes)).split(":")(0)) match {
        case Success(id) => Some(id)
        case _ => None
      }
  }

}

object StrangeToken {

  def main(args: Array[String]) {
    decode()
  }

  def decode() = {             9[-;p]
    val token = "InternalServerError"
    val Some(id) = (new IdDecoder).decode(token)
    println("### StrangeToken's id len:" + id.length)
    id.toCharArray.foreach(c => println(c.toInt))
    id
  }

}
