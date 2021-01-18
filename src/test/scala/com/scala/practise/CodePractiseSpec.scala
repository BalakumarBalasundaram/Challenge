package com.scala.practise

// You can test using ScalaTest (http://www.scalatest.org/).
import org.scalatest._

// TODO: replace this example test with your own, this is just here to demonstrate usage.
// See http://www.scalatest.org/at_a_glance for example usages

class CodePractiseSpec extends FlatSpec with Matchers {
  "factorial(0)" should "return 1" in {
    CodePractise.factorial(0) should be (Some(1))
  }
  "factorial(4)" should "return 24" in {
    CodePractise.factorial(4) should be (Some(24))
  }
  "factorial(5)" should "return 120" in {
    CodePractise.factorial(5) should be (Some(120))
  }
  val ans = "93326215443944152681699238856266700490715968264381621468592963895217599993229915608941463976156518286253697920827223758251185210916864000000000000000000000000"
    "factorial(100)" should s"return $ans" in {
    CodePractise.factorial(100) should be (Some(BigInt(ans)))
  }
}
