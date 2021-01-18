package com.exercise.telia.assignment

import scala.annotation.tailrec

/**
  * Telia Challenge: Read the input direction provided, concise the directions by rejecting the opposite direction and emit the simplified version direction plan
  */

object Challenge {

  /**
    *
    * @param dir1 String
    * @param dir2 String
    * @return Boolean
    *
    * Function - checkDirections returns true if the directions are opposite
    *
    */
  def checkDirections(dir1: String, dir2: String): Boolean = {
    dir1 == "NORTH" && dir2 == "SOUTH" || dir1 == "SOUTH" && dir2 == "NORTH" ||  dir1 == "EAST" && dir2 == "WEST" ||  dir1 == "WEST" && dir2 == "EAST"
  }


  /**
    *
    * @param ls List[String]
    * @param reducedDirection List[String]
    * @return List[String]
    *
    * Function dirReductionAlgorithm - iterates the input direction, compares the directions and returns the simplified directions by neglecting opposite direction
    */
  @tailrec
  def dirReductionAlgorithm(ls: List[String], reducedDirection:List[String]): List[String] = ls match {
    case Nil => reducedDirection
    case head :: tail if reducedDirection.isEmpty => dirReductionAlgorithm(tail, List[String](head))
    case head :: tail if checkDirections(head, reducedDirection.last) => dirReductionAlgorithm(tail, reducedDirection.init)
    case head :: tail => dirReductionAlgorithm(tail, reducedDirection :+ head)
  }

}
