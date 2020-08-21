package lectures.part1basics

import scala.annotation.tailrec

object Functions extends App {

  def someBasicParameterFunction(someString: String, someInt: Int): String = {
    someString + " " + someInt
  }

  println(someBasicParameterFunction("Hello", 42))

  def someBasicParameterLessFunction(): Int = 42

  println(someBasicParameterLessFunction())
  println(someBasicParameterLessFunction)

  /* In case of a need for loops always go for Recursion in Scala unlike other imperative programming languages like Python or Java
  *  A return type should always be mentioned for the recursive functions */

  def someAuxiliaryFunction(n: Int): Int = {
    def someFunctionInsideCodeBlock(a: Int, b: Int): Int = a + b
    someFunctionInsideCodeBlock(n, n-1)
  }

  // Exercises
  // 1. A greeting function which takes in Name & Age and returns a greeting
  // 2. Factorial Function
  // 3. Fibonacci Function
  // 4. Prime Number

  def someGreetingFunction(name: String, age: Int): String = s"Hi, my name is $name and I am $age years old."

  println(someGreetingFunction("Venkatesh", 32))

  def factorial(n: Int): Int = if (n <= 1) 1 else n * factorial(n - 1)

  println(factorial(5))

  def fibonacci(n: Int): Int = if (n <= 2) 1 else fibonacci(n - 1) + fibonacci(n - 2)

  println(fibonacci(8))

  def isPrime(n: Int): Boolean = {
    def helper(t: Int): Boolean = if (t <= 1) true else n % t != 0 && helper(t - 1)
    helper(math.sqrt(n).toInt)
  }

  println(isPrime(2003))

}
