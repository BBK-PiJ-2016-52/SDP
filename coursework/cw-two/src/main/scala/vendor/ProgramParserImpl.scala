package vendor

import scala.io.Source

/**
  * Created by jakeholdom on 09/03/2017.
  */
class ProgramParserImpl extends ProgramParser {
  override type InstructionList = Vector[Instruction]

  def instructionList(instruction: Instruction*): Vector[Instruction] = Vector(instruction: _*)

  /**
    * Parses a file representation of a bytecode program
    * into an `InstructionList`.
    *
    * @param file the file to parse
    * @return an instruction list
    */
  override def parse(file: String): InstructionList = {


    val lines = Source.fromFile(file).getLines
    //creates an iterator of each line in the file given
    var instructions = instructionList() //instantiates a new vector of instructions

    for (line <- lines) {
      //For each line in the iterator
      if (line.nonEmpty) {

        //appends the instructionList onto the vector of instructions
        instructions = instructions ++: parseString(line)

      } else {
        println("Reached end of file")

      }
    }

    instructions //returns instructions

  }

  /**
    * Parses a string representation of a bytecode program
    * into an `InstructionList`.
    *
    * @param string the string to parse
    * @return an instruction list
    */
  override def parseString(string: String): InstructionList = {

    var instructions = instructionList()

    val fields = string.split("\n") //gets the fields from each line if there are more than one
    //instructions on the string
    if (fields.nonEmpty) {
      for (field <- fields) { //for each line of instructions
        val fieldOne = field //initialises fieldone with the first instruction
        var fieldTwo: Vector[Int] = Vector[Int]() //initialises field two with an empty int vector
        if (field.contains(" ")) { //if the instruction contains an int
          val multipleInstr = field.split(" ")//split the two instructions
          val fieldOne = multipleInstr(0)//field one will be iconst
          fieldTwo = fieldTwo :+ multipleInstr(1).toInt //field two will be the int
          instructions = instructions :+ new Instruction(fieldOne, fieldTwo)// append instruction
        } else {
          instructions = instructions :+ new Instruction(fieldOne, fieldTwo)
        }
      }

    }

    instructions //return instructionList
  }
}
