package com.exercise.telia.assignment

import org.scalatest._
import org.scalatest.Assertions._
import TeliaChallengeSpec._
import com.exercise.explaination.TeliaChallengeExplaination

class TeliaChallengeSpec extends FlatSpec {

  it should "pass the expected direction" in {
    var scenarios = Array("NORTH", "SOUTH", "SOUTH", "EAST", "WEST", "NORTH", "WEST")
    runAlgorithmTest(scenarios, Array("WEST"))
    scenarios = Array("NORTH", "WEST", "SOUTH", "EAST")
    runAlgorithmTest(scenarios, Array("NORTH", "WEST", "SOUTH", "EAST"))
    scenarios = Array("NORTH", "SOUTH", "SOUTH", "EAST", "WEST", "NORTH", "NORTH")
    runAlgorithmTest(scenarios, Array("NORTH"))
  }

}

object TeliaChallengeSpec {
  private def runAlgorithmTest(scenarios: Array[String], expect: Array[String]): Unit = {
    println("input direction passed for reduction : " + scenarios.toList)
    val res: List[String] = List[String]()
    val actual: Array[String] = TeliaChallenge.dirReductionAlgorithm(scenarios.toList, res).toArray
    println("Test Results : " )
    println("Actual: " + actual.toList)
    println("Expected: " + expect.toList)
    println("--------------------------------------------")
    assertResult(expect){actual}
  }
}
