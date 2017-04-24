/**
  * Created by Eric on 24/04/2017.
  */
object NumberPersonalities {
  val limit = 100
  def main(args: Array[String]): Unit = {
    val i = 1
    for (i <- 1 to limit) println(i)
    println(isPrime(i))
  }

  def isPrime(n: Int): Boolean = {
    for (i <- 2 to n-1; if n%i == 0 ) {
      return false
    }
    true
  }
/*
  isHappy(n: Int): Boolean
  isTriangular(n: Int): Boolean
  isSquare(n: Int): Boolean
  isSmug(n: Int): Boolean
  isHonest(n: Int): Boolean
  isPronic(n: Int): Boolean
  isDeficient(n: Int): Boolean
  isPerfect(n: Int): Boolean
  isAbundant(n: Int): Boolean

  def sumOfPositiveDivisorsOf(i: Int): Int = ???

  sumOfPositiveDivisorsOf(n: Int): Int*/

}
