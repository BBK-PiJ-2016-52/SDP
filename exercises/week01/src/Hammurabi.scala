import scala.io.StdIn.readLine
import scala.util.Random

/**
  * Created by Eric on 07/04/2017.
  */

object Hammurabi {

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
    "your term. Rule poorly and you will be kicked out of office!\n")
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

    printIntroductoryMessage()

    for(i <- 1 to 10){
      optionToSelect("")
      println("O great Hammurabi!\n" +
        "You are in year "+ i + " of your ten year rule.\n" +
        "In the previous year " + starved + " people starved to death.\n" +
        "In the previous year " + immigrants + " people entered the kingdom.\n" +
        "The population is now " + population + ". We harvested " + harvest + " bushels at 3 bushels per acre.\n" +
        "Rats destroyed " + rats_ate + " bushels, leaving " + bushelsInStorage + " bushels in storage.\n" +
        "The city owns " + acresOwned + " acres of land.\n" +
        "Land is currently worth " + pricePerAcre + " bushels per acre.\n" +
        "There were " + plagueDeaths + " deaths from the plague.\n")
    }
  }

  def optionToSelect(message: String): Unit = {
    val optionSelected = readInt("O Great Hammurabi, Please select an option you would like too.. Type: \n" +
      "1 To Buy Land\n" +
      "0 To Sell Land\n")
    if (optionSelected == 1){
      val acresToBuy = askHowMuchLandToBuy(acresOwned, pricePerAcre)
      acresOwned = acresOwned - acresToBuy
      val GrainToFeed = askHowMuchGrainToFeedToThePeople(bushelsInStorage)
      bushelsInStorage = bushelsInStorage - GrainToFeed
    }
    if (optionSelected == 0){
      val acresToSell = askHowMuchLandToSell(acresOwned,pricePerAcre)
      acresOwned = acresOwned + acresToSell
      askHowMuchGrainToFeedToThePeople(bushelsInStorage)
    }
    if (optionSelected != 1 || optionSelected != 0){
      println("O Great Hammurabi, please select a valid option between Buy or Sell.")
    }
  }

  def askHowMuchLandToBuy(bushels: Int, price: Int): Int = {
    var acresToBuy = readInt("How many acres will you buy? \n")
    while (acresToBuy < 0 || acresToBuy * price > bushels) {
      println("O Great Hammurabi, we have but " + bushels + " bushels of grain! \n")
      acresToBuy = readInt("How many acres will you buy? \n")
    }
    acresToBuy
  }

  def askHowMuchLandToSell(bushels: Int, price: Int): Int = {
    var acresToSell = readInt("How many acres will you sell? \n")
    while (acresToSell > bushels || acresToSell < 0){
      println("O Great Hammurabi, we have but " + bushels + " bushels of grain! \n")
      acresToSell = readInt("How many acres will you sell? \n")
    }
    acresToSell
  }

  def askHowMuchGrainToFeedToThePeople(bushels: Int): Int ={
    var GrainToFeed = readInt("How many bushels of grain to feed the people? \n")
    while (GrainToFeed > bushels || GrainToFeed < 0) {
      println("O Great Hammurabi, we have " + bushels + " bushels of grain! \n")
      GrainToFeed = readInt("How many bushels of grain to feed the people? \n")
    }
    GrainToFeed
  }

  def askHowManyAcresToPlantWithSeed(bushels: Int): Unit = {
    val acresToPlantWithSeed = readInt("How many acres to plant with seed? \n")
    while (acresToPlantWithSeed > bushelsInStorage) {
      println("O Great Hammurabi, we have " + bushels + " \n")
    }
  }

  def readInt(message: String): Int = {
    try {
      readLine(message).toInt
    } catch {
      case _: Throwable =>
        println("That is not an integer. Please enter an integer. \n")
        readInt(message)
    }
  }
}
Hammurabi.hammurabi