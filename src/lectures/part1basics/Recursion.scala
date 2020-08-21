package lectures.part1basics

import scala.annotation.tailrec

object Recursion extends App {

  def factorial(n: Int): Int =
    if (n <= 1) 1
    else {
      println(s"factorial of $n which need the factorial of ${n - 1}")
      val result: Int = n * factorial(n - 1)
      println(s"factorial of $n calculated")
      result
    }

  //factorial(5000)  //Uncomment function call for the stack overflow error

  // Uses call stack to maintain the data which can be seen by using the print statements. The JVM will be holding all the intermediate values
  // in its limited available memory which will result in the Stack Overflow Error

  /* Whenever using the tail recursion always plan for persisting the intermediate result by using a helper function */

  def factorialImproved(n: Int): BigInt = {
    @tailrec
    def factHelper(x: Int, accumulator: BigInt): BigInt = {
      if (x <= 1) accumulator
      else factHelper(x - 1, x * accumulator)
    }
    factHelper(n,1)
  }

  println(factorialImproved(5000))

  // The helper function will help scala to complete the use & preserve only 1 stack frame whereas in the previous approach, scala needs to
  // create the n number of stack frame and persist the result until the end

  /* When in need for Loops always go for tail recursion */

  // Exercise
  // 1. Is Prime Function using Tail Recursion

  def isPrimeNumber(n: Int): Boolean = {
    @tailrec
    def helper(x: Int, accumulator: Int): Boolean = {
      if (accumulator <= 1) true
      else x % accumulator != 0 && helper(x, accumulator - 1)
    }
    helper(n, math.sqrt(n).toInt)
  }

  println(isPrimeNumber(2003))

  def isPrimeAnotherApproach(n: Int): Boolean = {
    @tailrec
    def helper(x: Int, accumulator: Boolean): Boolean = {
      if (!accumulator) false
      else {
        if (x <= 1) true
        else helper(x - 1, n % x != 0)
      }
    }
    helper(math.sqrt(n).toInt, true)
  }

  println(isPrimeAnotherApproach(9))

  // 2. Fibonacci Function using Tail Recursion

  def fibonacciNumber(n: Int): Int = {
    def helper(counter: Int, prevBalance: Int, accumulator: Int): Int = {
      if (n <= 2) accumulator
      else {
        if (n == counter) accumulator
        else helper(counter + 1, accumulator, accumulator + prevBalance)
      }
    }
  helper(2, 1, 1)
  }

  println(fibonacciNumber(8))

}
