package vm

import bc.{ByteCode, ByteCodeValues}
import factory.ByteCodeParserImpl
import vendor.{Instruction, ProgramParserImpl}

class VirtualMachineParserImpl extends VirtualMachineParser with ByteCodeValues{

  //Initialise instance of factory.
  var byteCodeParser = new ByteCodeParserImpl

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
  @throws(classOf[bc.InvalidBytecodeException])
  override def parse(file: String): Vector[ByteCode] = {
    val programParser = new ProgramParserImpl()
    val instructionVector: Vector[Instruction] = programParser.parse(file)
    var ByteCodeVector = Vector[ByteCode]()

    for (instruction <- instructionVector) {
      var instructionString = instruction.name
      //Check whether the instruction file to parse is empty or not
      if (instruction.args.nonEmpty) {
        instructionString += " " + instruction.args.head.toString
      }
      //appends the Instruction onto the vector of byte codes
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
  @throws(classOf[bc.InvalidBytecodeException])
  override def parseString(str: String): Vector[ByteCode] = {
    var byteCodes = Vector[ByteCode]()
    val fields = str.split("\n")

    //Check whether the file to parse is empty or not
    if (fields.nonEmpty) {
      for (field <- fields) { // Loop through all the fields of the file
        val fieldOne = field
        if (field.contains(" ")) {//

          val multipleString = field.split(" ")
          val fieldOne = bytecode(multipleString(0))
          val fieldTwo = multipleString(1).toByte
          if(validateByteCode(multipleString(0)) && multipleString(1).toInt > 0){

            //appends the fields onto the vector of byte codes
            byteCodes ++= byteCodeParser.parse(Vector(fieldOne, fieldTwo))

          }else{
            //An exception representing an invalid bytecode is thrown
            throw new bc.InvalidBytecodeException("Error: Invalid byte code")
          }
        } else {
          if (validateByteCode(field)) {
            byteCodes ++= byteCodeParser.parse(Vector(bytecode(fieldOne)))
          }else{
            //An exception representing an invalid bytecode is thrown
            throw new bc.InvalidBytecodeException("Error: Invalid byte code")
          }

        }

      }

    }
    byteCodes
  }

  /**
    * Checks whether the field is a valid bytecode field and returns a boolean
    * of the result.
    *
    * @param field string value of the field
    * @return boolean whether the bytecode is valid
    */
  def validateByteCode(field:String): Boolean = bytecode.contains(field)

}
