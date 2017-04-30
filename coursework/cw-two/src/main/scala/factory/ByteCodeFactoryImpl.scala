package factory
import bc.ByteCode

/**
  * Created by jakeholdom on 17/04/2017.
  */
class ByteCodeFactoryImpl extends bc.ByteCodeFactory with bc.ByteCodeValues{
  /**
    * Returns a [[ByteCode]].
    *
    * This method creates a new [[ByteCode]] object given the `byte`
    * that corresponds to the bytecode (see [[bc.ByteCodeValues]]. If
    * the bytecode requires arguments then an optional integer
    * argument is provided.
    *
    * This method should throw an [[bc.InvalidBytecodeException]] if the
    * given bytecode value is unknown.
    *
    * @param byte the byte code of a bytecode
    * @param args an optional integer argument (depends on bytecode)
    * @return a new bytecode object
    */
  override def make(byte: Byte, args: Int*): ByteCode = byte match {
      //check for each instance of bytecode and initialise a new instance of that class if found
      //if an iconst is found then parse the int parameter. If an invalid byte is found then throw
      //an invalidByteCodeException
    case a if bytecode("iadd") == a => new ByteCodeFactory.IaddByteCode
    case a if bytecode("iconst") == a => new ByteCodeFactory.IconstByteCode(args.head)
    case a if bytecode("idec") == a => new ByteCodeFactory.IdecByteCode
    case a if bytecode("idiv") == a => new ByteCodeFactory.IdivByteCode
    case a if bytecode("idup") == a => new ByteCodeFactory.IdupByteCode
    case a if bytecode("iinc") == a => new ByteCodeFactory.IincByteCode
    case a if bytecode("imul") == a => new ByteCodeFactory.ImulByteCode
    case a if bytecode("ineg") == a => new ByteCodeFactory.InegByteCode
    case a if bytecode("irem") == a => new ByteCodeFactory.IremByteCode
    case a if bytecode("isub") == a => new ByteCodeFactory.IsubByteCode
    case a if bytecode("iswap") == a => new ByteCodeFactory.IswapByteCode
    case a if bytecode("print") == a => new ByteCodeFactory.PrintByteCode
    case _ => throw new bc.InvalidBytecodeException("Error: Unknown byte found")
  }
}
