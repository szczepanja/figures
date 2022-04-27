import org.scalatest._
import flatspec._
import matchers._

class TriangleSpec extends AnyFlatSpec with should.Matchers {

  val triangle: Triangle = Triangle(4, 4, 2)

  it should "report its perimeter" in {
    triangle.perimeter shouldBe (10)
  }

  it should "report its area" in {
    triangle.area shouldBe (4)
  }

}