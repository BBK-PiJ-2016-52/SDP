package factory

trait Creator {
  def createProduct(x : Any):Product
}
