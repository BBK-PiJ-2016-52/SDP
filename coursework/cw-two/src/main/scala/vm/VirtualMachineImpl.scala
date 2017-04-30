package vm

import bc.ByteCode
import scala.collection.mutable.ListBuffer

class VirtualMachineImpl extends VirtualMachine{

  val values = new ListBuffer[Int]

  /**
    * Executes a vector of bytecodes.
    *
    * Note, that this is an "immutable" object. That is, it
    * will return a new virtual machine after executing each
    * of the bytecode objects in the vector.
    *
    * @param bc a vector of bytecodes
    * @return a new virtual machine
    */
  override def execute(bc: Vector[ByteCode]): VirtualMachine = {
    // Creates a new Virtual Machine after executing for each bytecode in the vector.
    val resultVM = new VirtualMachineImpl
    bc.foreach(bc => bc.execute(resultVM))
    resultVM
  }
  /**
    * Executes the next bytecode in the vector of bytecodes.
    *
    * This method only executes a single byte code in the vector of bytecodes.
    * It returns a tuple of the new vector of bytecodes (with the executed
    * bytecode removed) and the new virtual machine.
    *
    * You may assume that `bc` contains at least 1 bytecode.
    *
    * @param bc the vector of bytecodes
    * @return a tuple of a new vector of bytecodes and virtual machine
    */
  override def executeOne(bc: Vector[ByteCode]): (Vector[ByteCode], VirtualMachine) = {
    bc.head.execute(this) // Execute the head of bc.ByteCode
    (bc.drop(1), this)
  }

  /**
    * Pushes an integer value onto the virtual machine stack.
    *
    * @param value the integer to push
    * @return a new virtual machine with the integer `value` pushed
    */
  override def push(value: Int): VirtualMachine = {
    this.values += value // Add the value to ListBuffer of Int
    this
  }

  /**
    * Pops an integer value off of the virtual machine stack.
    *
    * @return (i, vm), where i is the integer popped and vm is the
    *         new virtual machine
    */
  override def pop(): (Int, VirtualMachine) = (values remove values.size - 1, this)

  /**
    * Returns the state of the virtual machine stack.
    *
    * The value at index 0 is the value on the top of the stack.
    *
    * @return the state of the stack
    */
  override def state: Vector[Int] = {
    var resultVM = Vector[Int]() // Initialize a immutable vector of Int
    for (i <- values) resultVM = resultVM :+ i // Adds the result Vector of VM (Prepend)
    resultVM.reverse // Show the result of VM downwards on the top of the Stack.
  }
}
