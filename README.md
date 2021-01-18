# Scala Assignment
* Package Name: com.scala.telia.assignment
* Author: Balakumar Balasundaram
* DateTime: 13 Jan 2021 22:43:00 

## Required
* Scala 2.11.6
* sbt 1.2.8

## Directory Structure

   README.md
   build.sbt          : (scala) sbt file build spark scala dependency 
   project            : (scala) other sbt setting : plugins.sbt, build.properties...
   src                : (scala) MAIN SCALA SPARK TESTS/SCRIPTS 

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

