[![src](https://img.shields.io/badge/source-main-brightgreen.svg)][main]

[main]: https://github.com/BBK-PiJ-2016-52/SDP/tree/master/coursework/cw-one/src/main/scala/sml

## Assignment One - Simple Machine Language (SML) :bookmark_tabs: :mag:    

An interpreter for a simple machine language — SML. The general form of
a machine language instruction is:  
> ``` label instruction register-list``` 

where:  
- ```label``` 
 is the label for the line.
Other instructions might “jump” to that label.   
- ```instruction```   is the actual instruction.
In SML, there are instructions for adding, multiplying and so on, for storing and
retrieving integers, and for conditionally branching to other labels (like an if statement).
- ```register-list ```  is the list of registers that the instruction manipulates.
Registers are simple, integer, storage areas in computer memory, much like variables.
In SML, there are 32 registers, numbered 0, 1, . . . , 31.   

#### Repository Structure
```cw-two
   ├── build.sbt
   ├── cw-one.iml
   ├── project
   │   └── build.properties
   ├── src
   │   ├── main
   │   │   ├── scala
   │   │   │   └── sml
   │   │   │       ├── ...
   │   └── test
   │       ├── scala
   │       │   ├── sml
   │       │   │   ├── ...
   └── README.MD
   └── test1.sml
   └── test2.sml```
