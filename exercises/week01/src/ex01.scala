/**
  * Created by Eric on 31/01/2017.
  */
object ex01 {
  def main(args: Array[String]) {

    // Get started:
    var a = 2 + 2
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
    while(numberRegistered != 0){
      println("Enter a number to obtain the square: ")
      numberRegistered = readLine.toInt
      println (numberRegistered*numberRegistered)
    }

    // Use a for loop:
    var i = 0;
    for( i <- 1 to 25){
      println( "Value of i is: " + i + " the square is: " + (i*i) + " and the cube Square is: " + scala.math.pow(i,3) );
    }

    

  }
}
