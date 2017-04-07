import scala.io.StdIn.readLine
import scala.util.Random

/**
  * Created by Eric on 07/04/2017.
  */

object Hammurabi {

  for(i <- 1 to 10){
    println("O great Hammurabi!\n" +
      "You are in year "+ i + " of your ten year rule.\n" +
      "In the previous year 0 people starved to death.\n" +
      "In the previous year 5 people entered the kingdom.\n" +
      "The population is now 100.\nWe harvested 3000 bushels at 3 bushels per acre.\n" +
      "Rats destroyed 200 bushels, leaving 2800 bushels in storage.\n" +
      "The city owns 1000 acres of land.\n" +
      "Land is currently worth 19 bushels per acre.\n" +
      "There were 0 deaths from the plague.")
  }

def printIntroductoryMessage(): Unit ={
  println("Congratulations, you are the newest ruler of ancient Samaria, elected\n" +
    "for a ten year term of office. Your duties are to dispense food, direct\n" +
    "farming, and buy and sell land as needed to support your people. Watch\n" +
    "out for rat infestations and the plague! Grain is the general currency,\n" +
    "measured in bushels. The following will help you in your decisions:\n" +
    "* Each person needs at least 20 bushels of grain per year to survive.\n" +
    "* Each person can farm at most 10 acres of land.\n" +
    "* It takes 2 bushels of grain to farm an acre of land.\n" +
    "* The market price for land fluctuates yearly.\n" +
    "Rule wisely and you will be showered with appreciation at the end of\n" +
    "your term. Rule poorly and you will be kicked out of office!")
}
  var starved = 0 // how many people starved
  var immigrants = 5 // how many people came to the city
  var population = 100
  var harvest = 3000 // total bushels harvested
  var bushelsPerAcre = 3 // amount harvested for each acre planted
  var rats_ate = 200 // bushels destroyed by rats
  var bushelsInStorage = 2800
  var acresOwned = 1000
  var pricePerAcre = 19 // each acre costs this many bushels
  var plagueDeaths = 0


  def hammurabi(): Unit = {
    /*var acresToBuy = askHowMuchLandToBuy(bushelsInStorage, pricePerAcre)
    acresOwned = acresOwned + acresToBuy*/

    var acresToSell = askHowMuchLandToSell(acresOwned,pricePerAcre)
    acresOwned = acresOwned - acresToSell
  }
  def askHowMuchLandToBuy(bushels: Int, price: Int): Int = {
    var acresToBuy = readInt("How many acres will you buy? ")
    while (acresToBuy < 0 || acresToBuy * price > bushels) {
      println("O Great Hammurabi, we have but " + bushels + " bushels of grain!")
      acresToBuy = readInt("How many acres will you buy? ")
    }
    acresToBuy
  }

  def askHowMuchLandToSell(bushels: Int, price: Int): Int = {
    var acresToSell = readInt("How many acress will you sell? ")
    while (acresToSell > acresOwned){
      println("O Great Hammurabi, we have but " + bushels + " bushels of grain!")
      acresToSell = readInt("How many acress will you sell? ")
    }
    acresToSell
  }

  def askHowMuchGrainToFeedToThePeople(): Unit ={

  }

  def askHowManyAcresToPlantWithSeed(): Unit = {

  }


  def readInt(message: String): Int = {
    try {
      readLine(message).toInt
    } catch {
      case _: Throwable =>
        println("That is not an integer. Please enter an integer.")
        readInt(message)
    }
  }

}