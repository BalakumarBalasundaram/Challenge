# Scala Assignment
* Package Name: com.scala.telia.assignment
* Author: Balakumar Balasundaram
* DateTime: 13 Jan 2021 22:43:00 

## Required
* Scala 2.11.6
* sbt 1.2.8

Software Requirements
You will need to install:

Java SE 8 http://www.oracle.com/technetwork/java/javase/downloads/index.html

Scala Build Tool (SBT) http://www.scala-sbt.org/download.html

Scala Build Tool (SBT)
The Scala Build Tool (SBT http://www.scala-sbt.org/) is used to compile and test the Scala assignments. Files must NOT be renamed or refactored, and the test code and build instruction files must NOT be altered. Specifically, you should only edit files under src/main/.

SBT will take care of downloading the correct version of Scala for you. You will need to be connected to the Internet when you do this.

Launch SBT
From a shell window (Linux or OS X) or CMD/Powershell prompt (Windows), launch SBT using the command you set up during SBT installation. This is usually just sbt. For example:

$ sbt
[info] Loading project definition from /csc348/main/project
[info] Set current project to CSC348 Assignments (in build file:/csc348/main/)
>
NOTE: you must be in the directory that contains the file build.sbt and has the directory src when you run the sbt command. Use cd to change to that directory if necessary. The build.sbt file contains instructions for building and testing the project. It will compile code into a new target subdirectory.

Launch Scala Console from SBT
To launch the Scala console from the SBT console, run:

console
To exit the Scala console and return to the SBT console, enter:

:quit
You will have access to your source code files in the Scala console.

Note: if you paste into the Scala console, the parser looks for the smallest syntactically correct expression, and this may not be what you want. If this becomes problematic, you should either put curly braces around the body of functions when pasting (this has been done for you already in the homework assignments), or to investigate the :paste command in the Scala interpreter, i.e., type :paste, then paste code in.

Compiling with SBT
To compile the Scala source code with SBT, run:

compile
To continuously compile, run:

~compile
For the assignments, you may prefer to simply run the tests as you go. However, for tricky exercises, you may wish to edit source code, compile it from the SBT console, and try it out in the Scala console.

Testing with SBT
From the SBT console, you can run various commands to compile and run the tests under src/test.

When you ask SBT to run any tests, it will automatically compile your source code and the test code first (if it does not appear to do so, ensure that you have saved your source code file in your text editor!).

To run all tests from the SBT console:

test

## Run the command
sbt clean compile -> sbt test

# Coding Challenge - Direction Reduction Details

#1 - Background
We are given directions to go from one point to another. The directions are "NORTH", "SOUTH", "WEST", "EAST". Clearly "NORTH" and "SOUTH" are opposite, "WEST" and "EAST" too. Going one direction and coming back the opposite direction is a wasted effort, so let's concise these directions to go the shortest route.
For example, given the following directions:

You can immediately see that going "NORTH" and then "SOUTH" is not reasonable, better stay to the same place!

So the task is to reduce a simplified version of the plan. A better plan in this case is simply:

##Other examples:
In ["NORTH", "SOUTH", "EAST", "WEST"], the direction "NORTH" + "SOUTH" is going north and coming back right away. What a waste of time! Better to do nothing. The path becomes ["EAST", "WEST"], now "EAST" and "WEST" annihilate each other, therefore, the final result is [] .

In ["NORTH", "EAST", "WEST", "SOUTH", "WEST", "WEST"], "NORTH" and "SOUTH" are not directly opposite but they become directly opposite after the reduction of "EAST" and "WEST" so the whole path is reducible to ["WEST", "WEST"].

# 2 - Task
You have to write a function dirReduc in Python or Scala which will take an array of strings and returns an array of strings with the needless directions removed (W<->E or S<->N side by side).
The task will not only be assessed on correct functionality but also how optimal the code is from a performance perspective.

# 3 - Specification
TeliaChallenge.dirReduc(arr)
Parameters
arr: Array<String> - An array with each index containing 1 of the 4 cardinal directions, all in uppercase
Return Value
Array<String> - The optimized set of instructions
Examples
arr	Return Value

##Example1:
["NORTH","SOUTH","SOUTH","EAST","WEST","NORTH","WEST"]	["WEST"]

##Example2:
["NORTH","SOUTH","SOUTH","EAST","WEST","NORTH"]	[]

##Example3:
["NORTH","WEST","SOUTH","EAST"]	["NORTH","WEST","SOUTH","EAST"]

#4 - Note
Not all paths can be made simpler.
The path ["NORTH", "WEST", "SOUTH", "EAST"] is not reducible. "NORTH" and "WEST", "WEST" and "SOUTH", "SOUTH" and "EAST" are not directly opposite of each other and can't become such. Hence the result path is itself : ["NORTH", "WEST", "SOUTH", "EAST"].
Difficulty Estimates
Intermediate Difficulty, 30 Minutes Estimated Time

