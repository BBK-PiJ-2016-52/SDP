package decorator

class SimplyVegPizza extends Pizza {
  def getDesc: String = {
    return "Simple vegetarian pizza"
  }

  def getPrice: Double = {
    return 8.00
  }
}
