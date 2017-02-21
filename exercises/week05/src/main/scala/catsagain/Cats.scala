package catsagain

// Feline at root and Lion, Tiger, Panther and Cat as sub-types
// add a method "dinner" ->
// Lions -> Antelope
// Tigers -> Tiger Food
// Panters -> Licorice
// Cats -> Mice

// Implement the food as a sealed trait and case object -- pattern machine

sealed trait Feline {
   def dinner: Food = 
      this match {
          case Lion() => Antelope
          case Tiger() => TigerFood
          case Panther() => Licorice
          case Cat() => Mice()
      }
}
final case class Lion() extends Feline
final case class Tiger() extends Feline
final case class Panther() extends Feline
final case class Cat() extends Feline

/* -- function to compute the same w/o using polimorphism or pattern machine
object Dinner {
   def dinner(feline: Feline): Food = 
      Feline match {
          case Lion() => Antelope
          case Tiger() => TigerFood
          case Panther() => Licorice
          case Cat() => Mice()
         }
}
*/
