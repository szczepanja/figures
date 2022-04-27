import org.scalatest._
import flatspec._
import matchers._

class RectangleSpec extends AnyFlatSpec with should.Matchers {

  val rectangle = Rectangle(4, 8)

  it should "report its perimeter" in {
    rectangle.perimeter shouldBe (24)
  }

  it should "report its area" in {
    rectangle.area shouldBe (32)
  }

}
