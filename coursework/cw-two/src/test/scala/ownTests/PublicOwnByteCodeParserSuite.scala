package ownTests

import factory.ByteCodeFactory.{IaddByteCode, IconstByteCode, IswapByteCode}
import org.scalatest.FunSuite

/**
  * Created by jakeholdom on 17/04/2017.
  */
class PublicOwnByteCodeParserSuite extends FunSuite with bc.ByteCodeValues{
  val bcp = new factory.ByteCodeParserImpl

  test("[1] ByteCodeParser should parse Vector Byte into Vector ByteCode") {

    val code = Vector(bytecode("ineg"), bytecode("imul"), bytecode("iadd"), bytecode("idup"))
    val bc = bcp.parse(code)
    assert(bc.length == 4)
    assert(bc(0).code == bytecode("ineg"))
    assert(bc(1).code == bytecode("imul"))
    assert(bc(2).code == bytecode("iadd"))
    assert(bc(3).code == bytecode("idup"))


  }

}
