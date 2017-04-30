package factory

import bc.{ByteCodeFactory, ByteCodeParser}
import vm._
import vendor.{ProgramParser, ProgramParserImpl}

/**
  * The `VirtualMachineFactory` follows the *factory pattern*. It provides
  * methods for each of the important parts in this assignment. You must
  * implement each method such that it returns an object of the correct type.
  */
object VirtualMachineFactory {

  def byteCodeFactory: ByteCodeFactory = new ByteCodeFactoryImpl //return new instance

  def vendorParser: ProgramParser = new ProgramParserImpl //return new instance

  def byteCodeParser: ByteCodeParser = new ByteCodeParserImpl

  def virtualMachineParser: VirtualMachineParser = new VirtualMachineParserImpl

  def virtualMachine: VirtualMachine = new VirtualMachineImpl
}