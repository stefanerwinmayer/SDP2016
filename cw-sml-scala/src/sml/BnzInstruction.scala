package sml

class BnzInstruction(label: String, op: String, val opreg: Int, val dest: String) extends Instruction(label, op) {

  override def execute(m: Machine) {
    val value = m.regs(opreg)
    val destline = m.labels.labels.indexOf(dest)
    if (value != 0) m.execute(destline)
  }

  override def toString(): String = {
    super.toString + " if " + opreg + " ≠ 0 go to " + dest + "\n"
  }
}

object BnzInstruction {
  def apply(label: String, opreg: Int, dest: String) =
    new BnzInstruction(label, "bnz", opreg, dest)
}