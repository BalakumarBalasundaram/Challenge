package com.exercise.explaination

import org.apache.log4j.Logger

object TeliaChallengeExplaination {

  val log = Logger.getLogger(this.getClass)

  /**
    * Function - isOppositeDirection(String, String)
    * Accepts two input string and checks the directions are opposite.
    *
    * Function recursiveDirReduc(List[String], List[String])
    * inputs: Accepts two parameters , list of string and empty result
    * case 1: when input directions is empty
    * case 2: when result is empty
    * case 3: when head of input directions and last element of result are in opposite direction
    * case 4: on other cases
    *
    */


  def dirReduc(arr: Array[String]): Array[String] = {


    def isOppositeDirection(dir1: String, dir2: String): Boolean = {

      println("comparison of directions : " + dir1 + " and " + dir2)

      dir1 == "NORTH" && dir2 == "SOUTH" ||
        dir1 == "SOUTH" && dir2 == "NORTH" ||
        dir1 == "EAST" && dir2 == "WEST" ||
        dir1 == "WEST" && dir2 == "EAST"
    }


    def recursiveDirReduc(ls: List[String], res: List[String] = List[String]()): List[String] = {

      println("input to direction reduction algorithm : " + ls + " and result : " + res)

      ls match {
        case Nil => {
          println("case 1 pattern matched - list is nil,  result will be returned " + res)
          res
        }
        case h :: tail if res.isEmpty => {
          println("case 2 pattern matched - result list is empty")
          println("input to direction reduction  : " + tail + "  and result : " + h)
          println("----------------------------------------------------------------------------------")
          recursiveDirReduc(tail, List[String](h))
        }
        case h :: tail if isOppositeDirection(h, res.last) => {
          val resInit = res.init
          println("case 3 pattern matched - first element of input list and last element of result are in opposite direction ")
          println("input to direction reduction  : " + tail + " and result init : " + resInit)
          println("----------------------------------------------------------------------------------")
          recursiveDirReduc(tail, resInit)
        }

        case h :: tail => {
          val nextElement = res :+ h
          println("case 4 execution - on rest of cases ")
          println("input to direction reduction : " + tail + " and res :+ h : " + nextElement)
          println("----------------------------------------------------------------------------------")
          recursiveDirReduc(tail, nextElement)
        }
      }
    }

    recursiveDirReduc(arr.toList).toArray

  }

}
