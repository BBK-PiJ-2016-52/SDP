package factory

class ConcreteCreator extends Creator{
  override def createProduct(x:Any): Product = {
    new ConcreteProduct(x)
    }
}