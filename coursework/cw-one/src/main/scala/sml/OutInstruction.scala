package sml

class OutInstruction(label: String, op: String, val op1: Int) extends Instruction(label, op) {
  override def execute(m: Machine): Unit = {
    val value = m.regs(op1)
    m.regs(op1) = value
  }

  override def toString: String = {
    super.toString + " " + op1
  }
}

object OutInstruction {
  def apply(label: String, op1: Int): OutInstruction =
    new OutInstruction(label, "out", op1)
}