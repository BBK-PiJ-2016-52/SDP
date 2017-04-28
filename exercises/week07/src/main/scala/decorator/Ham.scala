package decorator

class Ham(val pizza: Pizza) extends Pizza {
  def getDesc: String = {
    return "Adding Ham"
  }

  def getPrice: Double = {
    return 4.00
  }
}
