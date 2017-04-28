package decorator

class Cheese(val pizza: Pizza) extends Pizza {
  def getDesc: String = {
    return "Adding Cheese"
  }

  def getPrice: Double = {
    return 3.50
  }
}
