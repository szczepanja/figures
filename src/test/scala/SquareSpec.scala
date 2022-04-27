import org.scalatest._
import flatspec._
import matchers._

class SquareSpec extends AnyFlatSpec with should.Matchers {

  val square = Square(4)

  it should "report its perimeter" in {
    square.perimeter shouldBe (16)
  }

  it should "report its area" in {
    square.area shouldBe (16)
  }

}
