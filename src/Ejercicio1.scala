object Ejercicio1 {
  def main(args: Array[String]) {
    println(square(9))
    println(area(10))
    println(sumOfSquares(10,6))
  }

  def square(x: Double) = x * x

  def area(radius: Double): Double = 3.14159 * square(radius)

  def sumOfSquares(x: Double, y: Double) = square(x) + square(y)
}
