package decorator

class RomaTomatoes(val pizza: Pizza) extends Pizza {
  def getDesc: String = {
    return "Adding Sauce"
  }

  def getPrice: Double = {
    return 2.00
  }
}
