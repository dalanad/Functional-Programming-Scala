// 19000332
// Assignment - Case Class
case class Point(x: Int, y: Int) {
  // 1. add(+) should add two given points
  def +(that: Point) = Point(this.x + that.x, this.y + that.y)

  // 2. move should move a point by a given distance dx and dy
  def move(dx: Int, dy: Int) = Point(this.x + dx, this.y + dy)

  // 3. distance should return the distance between two given points
  def distance(a: Point): Double = scala.math.sqrt(
    (scala.math.pow((a.x - this.x), 2) + scala.math.pow((a.y - this.y), 2))
  )

  // 4. invert should switch the x and y coordinates.
  def invert() = Point(this.y, this.x)
}

object CaseClass extends App {

  val X = Point(50, 30)
  val Y = Point(63, 110)

  val sum = X + Y;
  val move = X.move(10, 10)
  val invertX = X.invert()
  val distenceXY = X.distance(Y)

  println("ADD X and Y  : " + sum)
  println("Move X by 10,10 : " + move)
  println("Distance between X and Y : " + distenceXY)
  println("Invert of X : " + invertX)
}
