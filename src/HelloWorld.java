//package com.bridgelabz.basics;

// JDK (Java Development Kit) => 18 Version
// Java brings new versions of java
// Java braught java 8 (Java 1.8) => It braught many new features with it which were very usefull
// This java version became a stable version of java.
// Not all of the version were famous or they were not that much use by developer
// These were unstable versions.

// Depracated versions => old java versions which are not usefull.



// JDK => JRE(Java Runtime Environment) , Compilers , Java debuggers etc.
// JRE => JVM (Java Virtual Machine), It is Operating System specific.
//  .java file (source file where you write your code)
//  When you run the programs , the .java file is loaded by class loader and it gets compiled
//  .class file is generated => byte code of the program
//  .class file is taken up by the JVM (Java Virtual Machine) for interpreting the byte code into machine readable code.
//  Finally this code is executed.

// Java is Platform independent => same .class file are fed to platform specific JVMs


// Durgasoft =>  only for JVM Architecture
// Java related topics => Javatpoint   ,  for examples => Geeksforgeeks
// stackoverflow for error.
// JVM Architecture

// .java - > compile -> .class file(byte code)

// .class file - > class-loader(loading, linking,initialzation) - >
// Loading -> bootstrap CL, application CL , extention CL - byte code load happens here
// Linking -> Verify , Prepare , Resolve
// Initialization ->

// JVM - Memory

//Method Area , Heap Area , Stack Area, PC Registers , Native Method Stack

// Method Area -> class level info of .class file, static part (variables)
// Heap Area -> Object level - instance part
// Stack Area -> stack frames
// PC Registers - > PC register for each thread - > address of next instructions

// Execution Engine
// Interpreter , JIT Compiler - Profiler , GC -------> Uses -> JNI (Java Native Interface)
// Machine level code is generated . Native Method Libraries


// Platform independent -----> .class files given to execution engine(interpreter)
public class HelloWorld {
    // Anything which is static is at a class level
    // When the class gets loaded , the static part of the code also gets loaded

    // In java we have threads.
    // Main method is executed by main thread
    // Each thread has a stack .Inside stack we have stack frames(Method specific info.)
    static int x = 0;

    public static void main(String[] args) {
        System.out.println("Hello World");
        HelloWorld helloWorld = new HelloWorld();
        String str = new String();
    }
}
