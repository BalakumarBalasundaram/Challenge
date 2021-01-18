package com.exercise.explaination

import TeliaChallengeExplainationSpec._
import org.scalatest.Assertions._
import org.scalatest._

class TeliaChallengeExplainationSpec extends FlatSpec {

  it should "pass basic tests" in {

    var a = Array("NORTH", "SOUTH", "SOUTH", "EAST", "WEST", "NORTH", "WEST")
    println("-------------------------- TEST CASE 1 -------------------------------------------" )
    testing(a, Array("WEST"))


    a = Array("NORTH", "WEST", "SOUTH", "EAST")
    println("-------------------------- TEST CASE 2 -------------------------------------------")
    testing(a, Array("NORTH", "WEST", "SOUTH", "EAST"))


    a = Array("NORTH", "SOUTH", "SOUTH", "EAST", "WEST", "NORTH", "NORTH")
    println("-------------------------- TEST CASE 3 -------------------------------------------")
    testing(a, Array("NORTH"))

  }

}

object TeliaChallengeExplainationSpec {
  private def testing(arr: Array[String], expect: Array[String]): Unit = {
    //println("input directions " + arr.mkString(", "))
    val actual: Array[String] = TeliaChallengeExplaination.dirReduc(arr)
    println()
    println("---------------------------- RESULT ---------------------------------------------------" )
    println("Actual: " + actual.mkString(", "))
    println("Expect: " + expect.mkString(", "))
    println("---------------------------------------------------------------------------------------" )
    println()

    assertResult(expect){actual}
  }
}

