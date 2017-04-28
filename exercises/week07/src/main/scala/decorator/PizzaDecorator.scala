package decorator

trait PizzaDecorator extends Pizza{

  def PizzaDecorator(pizza: Pizza){
    new SimplyVegPizza
  }

  def getDesc: String = ???

  def getPrice: Double = ???
}
