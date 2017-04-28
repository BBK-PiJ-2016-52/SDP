package practiceWithClasses

import org.scalatest.FunSuite

class Question1Test  extends FunSuite {

  test("Expected assert increment") {
    assert(new Counter(4).inc(4) == 8)
  }

  test("Expected assert decrementing") {
    assert(new Counter(6).dec(2) == 4)
  }

  test("No parameter inc 1") {
    assert(new Counter(1).inc() == 2)
  }

  test("No parameter dec 1") {
    assert(new Counter(5).dec() == 4)
  }

  test("Adjust with an int adds the int to the counter") {
    assert(new Counter(5).adjust(new Adder(3)) == 8)
  }

}