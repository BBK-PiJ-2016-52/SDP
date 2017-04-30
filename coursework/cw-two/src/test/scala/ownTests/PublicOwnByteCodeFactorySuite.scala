package ownTests

import org.scalatest.FunSuite
import bc.ByteCode
import factory.ByteCodeFactory.{IaddByteCode, IconstByteCode, IswapByteCode}

/**
  * Created by jakeholdom on 17/04/2017.
  */
class PublicOwnByteCodeFactorySuite extends FunSuite with bc.ByteCodeValues{
  val bcf = new factory.ByteCodeFactoryImpl

  test("[1] make method should create correct bytecode instance") {

    val iconst = bcf.make(bytecode("iconst"), 4)
    assert(iconst.code == bytecode("iconst"))
    assert(iconst.isInstanceOf[IconstByteCode])


    val iadd = bcf.make(bytecode("iadd"))
    assert(iadd.code == bytecode("iadd"))
    assert(iadd.isInstanceOf[IaddByteCode])


    val iswap = bcf.make(bytecode("iswap"))
    assert(iswap.code == bytecode("iswap"))
    assert(iswap.isInstanceOf[IswapByteCode])




  }

}
