import org.scalatest._
import flatspec._
import matchers._

class CircleSpec extends AnyFlatSpec with should.Matchers {

  val circle = Circle(4)

  it should "report its perimeter" in {
    circle.perimeter shouldBe (25.132741228718345)
  }

  it should "report its area" in {
    circle.area shouldBe (50.26548245743669)
  }

}
