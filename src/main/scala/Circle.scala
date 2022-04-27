case class Circle(r: Double) {

  def area: Double = Math.PI * (r * r)

  def perimeter: Double = 2 * Math.PI * r

}
