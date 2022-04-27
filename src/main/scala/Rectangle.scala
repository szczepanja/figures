case class Rectangle(a: Int, b: Int) extends Figures {

  def perimeter: Double = 2 * (a + b)

  def area: Double = a * b

}
