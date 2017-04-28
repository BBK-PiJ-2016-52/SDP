package Question1

case class Counter (input: Int){
  def inc(): Int = input + 1
  def inc(num: Int): Int = input + num
  def dec(num: Int): Int = input - num
  def dec() : Int = input - 1

  def adjust(adder: Adder) : Counter = {
    Counter(adder.add(input: Int))
  }
}