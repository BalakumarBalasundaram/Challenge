package com.scala.practise

/**
  *
  */
object CodePractise {

  /**
    *
    * @param n
    * @return
    */
  def factorial(n: Int): Option[BigInt] = {

    /**
      *
      * @param num
      * @param result
      * @return
      */
    def fact(num: Int, result: BigInt = BigInt(1)): BigInt =
      if (num == 0) result else fact(num - 1, result * num)

    if (n < 0) None else Option(fact(n))
  }

}
