package sml

class OutInstruction(label: String, op: String, val regout: Int) extends Instruction(label, op) {

  /*
  Class for Out instruction for SML. Execute function outputs value of register regout.

  Author: Matt Crompton
   */

  override def execute(m: Machine) {
    println(m.regs(regout))
  }

  override def toString(): String = {
    super.toString + " print value of " + regout + "\n"
  }
}

object OutInstruction {
  def apply(label: String, regout: Int) =
    new OutInstruction(label, "out", regout)
}