package Question3

class Director (firstName : String ,lastName : String, yearOfBirth : Int ){
  def name (): String =  firstName + lastName
}

object Director {
  def apply(firstName: String, lastName: String, yearOfBirth: Int): Director = {
    new Director(firstName, lastName, yearOfBirth)
  }
}