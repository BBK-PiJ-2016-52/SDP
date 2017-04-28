package decorator

class GreenOlives(val pizza: Pizza) extends Pizza {
  def getDesc: String = {
    return "Adding Green Olives"
  }

  def getPrice: Double = {
    return 1.50
  }
}
