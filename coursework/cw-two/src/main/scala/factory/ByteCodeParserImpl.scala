package factory

import bc.{ByteCode, ByteCodeParser, ByteCodeValues}
/**
  * Created by jakeholdom on 17/03/2017.
  */
class ByteCodeParserImpl extends ByteCodeParser{

  //initialise instance of factory
  var byteCodeFactory :ByteCodeFactoryImpl = new ByteCodeFactoryImpl
  /**
    * Parses a vector of `Byte` into a vector of `ByteCode`.
    *
    * You should use [[ByteCodeValues.bytecode]] to help translate
    * the individual `Byte`s into a corresponding [[ByteCode]].
    *
    * @param bc a vector of bytes representing bytecodes
    * @return a vector of `ByteCode` objects
    */
  override def parse(bc: Vector[Byte]): Vector[ByteCode] = {

    //Initialise vector of ByteCode which will be returned
    var byteCodeVector : Vector[ByteCode] = Vector[ByteCode]()

    var isIconst = false //boolean checks whether byte is iconst
    var iConstByte = bc.head //initialises byte which will be changed to iconst if one is found
    for (byte <- bc){ //loop through each byte in bc vector


      if (byte == bytecode("iconst") || isIconst){ //if bytecode is iconst of boolean is true
        //which means that the previous byte was an iconst
        if(!isIconst){ //if this is the iconst
          iConstByte = byte //set value to byte
          isIconst = true //Set boolean to true so the next loop will go to the else statement
        }else{ //if the previous byte was an iconst
          //Append the iconst and the int value to the vector
          byteCodeVector = byteCodeVector :+ byteCodeFactory.make(iConstByte, byte)
          isIconst = false //Set boolean to false to see if next value is not an iconst
        }
      }else{
        //Append byte which isn't iconst to the vector
        byteCodeVector = byteCodeVector :+ byteCodeFactory.make(byte)

      }

    }

    byteCodeVector //return vector
  }
}
