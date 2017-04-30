package vm

import bc.ByteCode
import factory.ByteCodeParserImpl
import vendor.{Instruction, ProgramParserImpl}

class VirtualMachineParserImpl extends VirtualMachineParser{

  //Initialise instance of factory.
  var byteCodeFactory = new ByteCodeParserImpl

  /**
    * Returns a vector of [[bc.ByteCode]].
    *
    * This method parses a file into a vector of bytecode objects.
    * Note, this method should throw a [[bc.InvalidBytecodeException]]
    * if it fails to parse a program file correctly.
    *
    * @param file the file containing a program
    * @return a vector of bytecodes
    */
  @throws(classOf[NoSuchElementException])
  @throws(classOf[NumberFormatException])
  @throws(classOf[ArrayIndexOutOfBoundsException])
  override def parse(file: String): Vector[ByteCode] = {
    val programParser = new ProgramParserImpl()
    val instructionVector: Vector[Instruction] = programParser.parse(file)
    var ByteCodeVector = Vector[ByteCode]()

    for (instruction <- instructionVector) {
      var instructionString = instruction.name
      if (instruction.args.nonEmpty) {
        instructionString += " " + instruction.args.head.toString
      }
      ByteCodeVector = ByteCodeVector ++: parseString(instructionString)
    }
    ByteCodeVector
  }



  /**
    * Returns a vector of [[bc.ByteCode]].
    *
    * This method parses a string into a vector of bytecode objects.
    * Note, this method should throw a [[bc.InvalidBytecodeException]]
    * if it fails to parse a program string correctly.
    *
    * @param str a string containing a program
    * @return a vector of bytecodes
    */
  override def parseString(str: String): Vector[ByteCode] = {
    var byteCodes = Vector[ByteCode]()
    val fields = str.split("")

    if (fields.nonEmpty) {
      for (field <- fields){
        val fieldOne = field
        val fieldTwo: Vector[ByteCode] = Vector[ByteCode]()
        if(field.contains("")){
          val multipleString = field.split(" ")
          val fieldOne = multipleString(0)
          fieldTwo = fieldTwo :+ multipleString(fields).toByte
          byteCodes = byteCodes :+ new ByteCode(Vector(fieldOne,fieldTwo))
        } else {
          byteCodes = byteCodes :+ new ByteCode(fieldOne,fieldTwo)

        }

      }

    }
    byteCodes
  }
}
