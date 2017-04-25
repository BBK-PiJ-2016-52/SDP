package WorksheetScalaI

import scala.io.StdIn.readLine
/**
  * Created by Eric on 31/01/2017.
  */
object ex01 {
  def main(args: Array[String]) {

    // Get started:
    val a = 2 + 2
    println ("The result of 2 + 2 = " + a)

    // Reading and printing:


    //Use an if statement:
    println("")
    println("Enter a number for comparision: ")
    var numberEntered = 0
    numberEntered = readLine.toInt
    if (numberEntered >= 100){
      println ("That’s a big number.")
    }else {
      println("That’s a small number.")
    }

    // Use a while loop:
    println("Type 1 to start, 0 to finish.")
    var numberRegistered = readLine.toInt
    while(numberRegistered == 0 || numberRegistered <= 100){
      println("Enter a number to obtain the square: ")
      numberRegistered = readLine.toInt
      println (numberRegistered*numberRegistered)
    }

    // Use a for loop:
    for( i <- 1 to 25){
      println( "Value of i is: " + i + " the square is: " + (i*i) + " and the cube Square is: " + scala.math.pow(i,3) )
    }

    // Writting a Function
    def isEven(num: Int): AnyVal = {
      if (num % 2 == 0) true
    }

    println("The number 2 is even: " + isEven(2))
    println("The number 3 is even: " + isEven(2))
    println("The number 22 is even: " + isEven(2))
  }
}