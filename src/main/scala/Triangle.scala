case class Triangle(a: Int, b: Int, c: Int) extends Figures {

  def area: Double = (a * c) / 2

  def perimeter: Double = a + b + c

}
