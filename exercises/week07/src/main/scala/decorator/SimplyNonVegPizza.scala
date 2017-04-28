package decorator

class SimplyNonVegPizza extends Pizza {
  def getDesc: String = {
    return "Simple non vegetarian pizza"
  }

  def getPrice: Double = {
    return 10.00
  }
}
