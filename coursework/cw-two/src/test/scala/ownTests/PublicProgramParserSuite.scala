package ownTests

import org.scalatest.FunSuite
import vendor.{Instruction, ProgramParserImpl}

/**
  * Created by jakeholdom on 10/03/2017.
  */
class PublicProgramParserSuite extends FunSuite {
  val ppi = new ProgramParserImpl

  test("[1] parseString should create an instruction list") {

    val intVector :Vector[Int] = Vector[Int]()
    val instruction1 =  new Instruction("iconst" , intVector :+ 4)
    val instruction2 = new Instruction("iconst" , intVector :+ 6)
    val instruction3 = new Instruction("iadd" , intVector)

    val iList : ppi.InstructionList = ppi.parseString("iconst 4\niconst 6\niadd")

    assert(iList.length == 3)
    assert(iList(0).name == instruction1.name)
    assert(iList(0).args == instruction1.args)
    assert(iList(1).name == instruction2.name)
    assert(iList(1).args == instruction2.args)
    assert(iList(2).name == instruction3.name)
    assert(iList(2).args == instruction3.args)

  }

  test("[2] parse should create an instruction list from file") {

    val intVector :Vector[Int] = Vector[Int]()
    val instruction1 =  new Instruction("iconst" , intVector :+ 4)
    val instruction2 = new Instruction("iconst" , intVector :+ 5)
    val instruction3 = new Instruction("iadd" , intVector)
    val instruction4 = new Instruction("print" , intVector)


    val iList : ppi.InstructionList = ppi.parse("/Users/jakeholdom/Programming/Scala/SDP/Coursework/cw-two/src/test/scala/ownTests/p01.vm")
    //val iList : ppi.InstructionList = ppi.parse("C:\\Users\\Eric\\Documents\\SDP\\Coursework\\cw-two\\src\\test\\scala\\ownTests\\p01.vm")

    assert(iList.length == 4)
    assert(iList(0).name == instruction1.name)
    assert(iList(0).args == instruction1.args)
    assert(iList(1).name == instruction2.name)
    assert(iList(1).args == instruction2.args)
    assert(iList(2).name == instruction3.name)
    assert(iList(2).args == instruction3.args)
    assert(iList(3).name == instruction4.name)
    assert(iList(3).args == instruction4.args)
  }
}