package sml

/**
  * Created by Eric on 05/04/2017.
  */
class BnzInstruction(label: String, op: String, val result: Int, val op1: Int, val op2: Int)
  extends Instruction(label, op){
  override def execute(m: Machine) {
    val value1 = m.regs(op1)
    val value2 = m.regs(op2)
    m.regs(result) = value1 + value2 // TODO Check the BNZ
  }
}
