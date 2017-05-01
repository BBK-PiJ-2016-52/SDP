/*
package options
object AddOptions extends App{

  // accepts three Option[Int] as formal parameters and return their sum
  // Version One - use flatMap and map
  // Version Two - use for comprehensions

  def addOptions(opt1: Option[Int],opt2: Option[Int], opt3: Option[Int]): Option[Int] =
    opt1 flatMap {a =>
      opt2 flatMap{b =>
        opt3 flatMap{c =>
          a +b + c
        }
      }
    }

  def addOptions(opt1: Option[Int],opt2: Option[Int], opt3: Option[Int]): Option[Int] =
    for {
      a <- opt1
      b <- opt2
      c <- opt3
    } yield a + b + c

  //val numbers: Seq[Option[Int]] = Seq(Some(1),Some(2),Some(3))
  println(addOptions(Some(1),Some(2),Some(3)))
  //numbers = Seq(None,Some(1),Some(10),None)
  println(None,Some(1),Some(10),None)
//  numbers = Seq(None,None,None)
  println(None,None,None)
}*/
