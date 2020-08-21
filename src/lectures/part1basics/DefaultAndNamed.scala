package lectures.part1basics

import scala.annotation.tailrec

object DefaultAndNamed extends App {

  @tailrec
  def factorial(n: Int, accumulator: Int): Int = {
    if (n <= 1) accumulator else factorial(n - 1, n * accumulator)
  }

  // In the above function definition, the accumulator value is always going to be 1. There is a way in scala to help us in passing the default
  // value to an argument

  @tailrec
  def factorialDefault(n: Int, accumulator: Int = 1): Int = {
    if (n <= 1) accumulator else factorialDefault(n - 1, n * accumulator)
  }

  println(factorialDefault(4)) // In this call, you don't have to pass the value for accumulator variable. It takes the default value of 1

  println(factorial(4, 2)) // In this call, you can over-ride the value for the accumulator variable.

  @tailrec
  def factorialLeadingDefault(accumulator: Int = 1, n: Int): Int = {
    if (n <= 1) accumulator else factorialLeadingDefault(n * accumulator, n - 1)
  }

  //println(factorialLeadingDefault(4))

  // The compiler will not be able to understand the value passed. So we cannot have a default argument as the leading argument

  def savePicture(format: String, width: Int = 800, height: Int = 600): Unit = println("picture saved")

  savePicture("jpg")

  // In this case the compiler is able to understand the argument being passed. But there is a catch
  // What if you want to over-ride the default value for the height?

  savePicture("jpg", 780)

  // The override value will be assigned based on the order present in the function definition. To overcome this we should use named argument

  savePicture("jpg", height = 780)

  /* Key Learning:
   * Never use default argument as the leading argument
   * Pass the values with Name when there are multiple default argument
   */

}
