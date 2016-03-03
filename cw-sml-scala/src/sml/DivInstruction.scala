package sml

class DivInstruction(label: String, op: String, val result: Int, val op1: Int, val op2: Int) extends Instruction(label, op) {

  /*
  Class for division instruction for SML. Execute function divides value in registers op1 by value in op2 and writes
  result to register in result variable.

  Author: Matt Crompton
   */

  override def execute(m: Machine) {
    val value1 = m.regs(op1)
    val value2 = m.regs(op2)
    m.regs(result) = value1/value2
  }

  override def toString(): String = {
    super.toString + " " + op1 + " ÷ " + op2 + " to " + result + "\n"
  }
}

object DivInstruction {
  def apply(label: String, result: Int, op1: Int, op2: Int) =
    new DivInstruction(label, "div", result, op1, op2)
}