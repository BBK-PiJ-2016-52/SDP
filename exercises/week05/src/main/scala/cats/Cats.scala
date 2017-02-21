package cats

// Feline at root and Lion, Tiger, Panther and Cat as sub-types
// add a method "dinner" ->
// Lions -> Antelope
// Tigers -> Tiger Food
// Panters -> Licorice
// Cats -> Mice

// Implement the food as a sealed trait and case object -- polymorphism

sealed trait Feline {
   def dinner: Food
}
final case class Lion() extends Feline {
   def dinner: Food = Antelope
}
final case class Tiger() extends Feline{
   def dinner: Food = TigerFood
}
final case class Panther() extends Feline{
   def dinner: Food = Licorice
}
final case class Cat() extends Feline{
   def dinner: Food = Mice()
}

