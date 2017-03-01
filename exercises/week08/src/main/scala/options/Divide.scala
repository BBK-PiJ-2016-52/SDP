package options
object Divide extends App{
  def divide(numerator: Int, denominator: Int): Option[Double] =
    if(denominator == 0) None else Some(numerator.toDouble/denominator.toDouble)

  println(divide(1,0))
  println(divide(1,2))
  println(divide(0,3))

}

// When the denominator is 0 it doesn't throw an exception but uses Option instead