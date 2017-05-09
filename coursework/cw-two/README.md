[![source](https://img.shields.io/badge/source-main-brightgreen.svg)][main]
[![source](https://img.shields.io/badge/source-test-yellow.svg)][test]
[![implementation](https://img.shields.io/badge/implementation-scala-blue.svg)][scala]

[main]: https://github.com/BBK-PiJ-2016-52/SDP/tree/master/coursework/cw-one/src/main/scala/sml
[test]: https://github.com/BBK-PiJ-2016-52/SDP/tree/master/coursework/cw-one/src/test/scala/sml
[scala]: http://www.scala-lang.org/

## Assignment Two - Virtual Machine :bookmark_tabs: :mag: :postbox:   

A stack-based virtual machine that executes
 a small set of “bytecode” instructions. Just like the Java Virtual Machine (JVM) that
 executes JVM bytecode, the virtual machine execute a small set of bytecode instructions
 represented as textual commands that manipulate the state of a virtual machine. These
 commands/instructions perform operations on a stack-based virtual machine to execute
 simple computations. 
 
 Here is an **example** of a simple program (in textual format) that
 adds two numbers, increments the result, then prints the result to the console:   
 
>```iconst 4```  
```iconst 5```  
```iadd ```   
```print```   

- The ```iconst``` instruction takes a single integer argument and pushes it onto the stack
  of the virtual machine.
- The ```iadd``` instruction pops the top two integer values from the stack, adds them,
    and pushes the result.
- The ```print``` instruction pops the value on the top of the stack and prints it to the
  console.

#### Instructions
This virtual machine is simple in that it only has a working stack to perform computations.
Each instruction described below has a textual representation, a byte value, and
the semantics of the instruction (what it does when it is executed). The byte value is
used by the virtual machine to identify which instruction it is executing. Each instruction
assumes the existence of a virtual machine VM that is used to define the corresponding
semantics.

* ```iconst NUM``` : The iconst instruction pushes the integer value NUM on the virtual machine
  stack.  
  ###### VM.push(NUM)  
* ```iadd``` : The iadd instruction pops the top two values from the virtual machine stack and
  pushes the result.
  ###### VM.push(VM.pop() + VM.pop())
* ```isub``` : The isub instruction pops the top two values from the virtual machine stack and
  pushes the result.
  ###### VM.push(VM.pop() - VM.pop())
* ```imul``` : The imul instruction pops the top two values from the virtual machine stack and
  pushes the result.
  ###### VM.push(VM.pop() * VM.pop())
* ```idiv``` : The idiv instruction pops the top two values from the virtual machine stack and
  pushes the result.
  ###### VM.push(VM.pop() / VM.pop())
* ```irem``` : The irem instruction pops the top two values from the virtual machine stack and
pushes the result.
  ###### VM.push(VM.pop() % VM.pop())
* ```ineg``` : The ineg instruction pops the the top value from the virtual machine stack,
  negates it, and pushes the result.
  ###### VM.push(-VM.pop())
* ```iinc``` : The iinc instruction pops the the top value from the virtual machine stack,
  increments it, and pushes the result.
  ###### VM.push(VM.pop()+1)
* ```idec``` : The idec instruction pops the the top value from the virtual machine stack,
  decrements it, and pushes the result.
  ###### VM.push(VM.pop()-1)
* ```iswap``` : The iswap instruction pops the top two values from the virtual machine stack
  and pushes them in the opposite order, effectively swapping the top two values of
  the stack.
  ###### x = VM.pop(); y = VM.pop(); VM.push(x); VM.push(y)
* ```idup``` : The idup instruction pops the top value from the stack and pushes it twice onto
  the stack (duplicates the top value).
  ###### x = VM.pop(); VM.push(x); VM.push(x).
* ```print``` : The print instruction pops the top value from the stack and prints the value to
  the console  

#### Repository Structure
```cw-two
├───.idea
│   ├───libraries
│   └───modules
├───programs
├───project
├───src
│   ├───instructor
│   │   └───scala
│   │       ├───bc
│   │       ├───vendor
│   │       └───vm
│   ├───main
│   │   └───scala
│   │       ├───factory
│   │       │   └───ByteCodeFactory
│   │       ├───vendor
│   │       └───vm
│   └───test
│       └───scala
│           ├───bc
│           ├───ownTests
│           ├───support
│           ├───vendor
│           └───vm
```
#### Developed by
 
|                                                                                                 | about                                                       | username                               |
--------------------------------------------------------------------------------------------------|----------------------------------------------------------------|---------------------------------------------------|
<img src="https://avatars1.githubusercontent.com/u/22638726?v=3&s=460"      height="50px" title="Eric Rodriguez"/>        |  Jake Holdom - jholdo01     | [`@BBK-PiJ-2016-08`](https://github.com/BBK-PiJ-2016-08)  |
<img src="https://avatars0.githubusercontent.com/u/22904851?v=3&u=cfb4a9acace450d6628c1c80ce6e46c985e178d2&s=400"      height="50px" title="Eric Rodriguez"/>        |    Eric Rodriguez - erodri07     |  [`@BBK-PiJ-2016-52`](https://github.com/BBK-PiJ-2016-52) |
