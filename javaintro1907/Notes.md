# Introduction to Java, Variables, Datatypes and Operators 19/07

- High level programming language
- Object oriented programming language like C++. Lower languages like C and pascal -> structured approach
- Used widely in major software engineering companies

## Computer

Consists of

- hardware
- software -> collection of programs to perform variety of tasks
  - system -> assist the system how to work 
  - application -> used for specific tasks on top of the resources provided by the system
  - database -> to store high volume of data

## Language

A medium to author softwares

### Basic language constructs

- variables
  - named memory locations
  - used to store values
- operators
  - arithmetic + - *
  - relational or comparison < > <= == !=
  - logical && || !
  - unary ++ --
  - ternary ?:
- datatypes -> used to define what type of value to be stored in a variable
  - int, float, double, char, boolean

## History of Java

- in 1991 at Sun Microsystems by Green Team comprising James Gosling, Patrick Naugthon, Mike Schredian, Herbert Scheild
- first named Oak -> symbol of strength
- proposed name Silk
- Java island in Indonesia where first coffee seeds were identified

## Features of Java

- Simple -> english like statements
- Pure OOP language; C++ not pure OOP as it functions even without constructs like class/objects when following C format.
- Robust - reliable due to features like exception handling, garbage collection
- Portable - platform independent. Write once run anywhere (WORA)
- Secure - distributed/isolated environment (JVM)
- case sensitive
- source files have extension .java

## Class

- Starts with a capital letter
- Follow Pascal casing
- Filename should be the same at the class defined in it
  
## Methods

- main()
  - entry point to the program
  - execution starts from main

## Compile and Execute steps

**Compile** -> creates .class file

    $> javac fileName.java

.class file  is bytecode file -> highly optimized set of instructions understood by JVM and can be executed on any machine if JVM is installed

**Execute**

    $> java fileName

## Frequently Terms Used

### **JDK - Java Development Kit**

Platform independent software development kit containing tools for developing, debugging programs etc.

### **JIT - Just in Time compiler**

Part if class loader that translates bytecode into machine code.

### **JRE - Java Runtime Environment**

Environment to execute java code

### **JVM - Java Virtual Machine**

Inside JVM, responsible for interpreting and executing the bytecode and generating machine code to run the java programs that is understandable by the underlying OS.

**Note:** JVM is platform dependant.
