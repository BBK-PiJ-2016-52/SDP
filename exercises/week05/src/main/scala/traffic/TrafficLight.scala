package traffic

// Model a Traffic Light (TL) using sealed traits(s)
// and case class(es) or case object(s)
// A TL is either Red, Green, Amber

// Using polymorphism add a next method which returns the next TL ins sequence -- polimorphism
// Red -> Green -> Amber

sealed trait TrafficLight {
   def next: TrafficLight
}

final case object Red extends TrafficLight{
   def next: Green
}

final case object Green extends TrafficLight{
   def next: Amber
}

final case object Amber extends TrafficLight{
   def next: Red
}