package sml

class BnzInstruction(label: String, op: String, val result: Int, val toLabel: String) extends Instruction(label, op){
  override def execute(m: Machine): Unit = {
    if (m.regs(result) != 0) {
      m.pc = m.labels.labels.indexWhere(p => p == result, 0)
    }
  }

  override def toString(): String =
    super.toString() + s" if reg: $result != 0 jump to $toLabel" + "\n"

}

object BnzInstruction {
  def apply(label: String, result: Int, toLabel: String): BnzInstruction =
    new BnzInstruction(label, "bnz", result, toLabel)
}

