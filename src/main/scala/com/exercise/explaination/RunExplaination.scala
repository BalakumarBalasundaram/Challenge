package com.exercise.explaination

import org.apache.log4j.Logger

object RunExplaination {


  def main(args: Array[String]): Unit = {

    val input = Array("NORTH", "SOUTH", "SOUTH", "EAST", "WEST", "NORTH", "WEST", "NORTH")

    println("input directions : " + input.toList)

    println("----------------------------------------------------------------------------------")

    val result = TeliaChallengeExplaination.dirReduc(input)

    println("----------------------------------------------------------------------------------")
    println("reduced directions : " + result.toList)

  }
}
