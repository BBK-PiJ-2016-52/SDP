package Question2

class Person(name: String) {
  var parts = Array[String]()
  parts = name.split(" ")
  print(parts(0))
}

object Person {
  def main(args: Array[String]): Unit  = {
    def apply(name: Array[String]): Person = new Person("Joe Johnson")
  }
}
