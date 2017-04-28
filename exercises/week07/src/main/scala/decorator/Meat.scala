package decorator

class Meat(val pizza: Pizza) extends Pizza {

  def getDesc: String = {
    return "Adding Meat"
  }

  def getPrice: Double = {
    return 5.00
  }
}
