
object Ejercicio2 {
  def main(args: Array[String]) {
    println(factorial(3))
    println(abs(-3))
  }

  def factorial(n: Int): Int =
    if (n ==  1 )  1
    else factorial(n - 1 ) * n

  def abs(x:Int) : Int = if(x>0) x else x * -1
}
