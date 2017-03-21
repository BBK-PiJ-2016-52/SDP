/**
  * Created by erodri07 on 01/03/2017.
  */

val Name:String
val lastName:String

val firstName:String = "Eric"

case class Person(first Name: String,lastName: String) = {
  def  sayHello(other: String): String = {
    firstName + " says hello to " + other
  }
}