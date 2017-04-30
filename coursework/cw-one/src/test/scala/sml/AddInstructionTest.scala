package sml

import org.scalatest.FunSuite

class AddInstructionTest extends FunSuite {


  test("[1]Assert the regs are being added") {
    val m : Machine = new Machine(Labels(), Vector())
    val label = "In1"
    val opCode = "sub"
    val op1 = 5
    val op2 = 5
    val result = 10
    val addInstruction: AddInstruction = new AddInstruction(label,opCode, result ,op1, op2)

    addInstruction.execute(m)

    assert(result == 15)
  }


}
