package decorator

class Spinach(val pizza: Pizza) extends Pizza {
  def getDesc: String = {
    return "Adding Spinach"
  }

  def getPrice: Double = {
    return 0.50
  }
}
