package lectures.part1basics

object Expression extends App {

  val addition = 2 + 3
  println(addition)

  //Expression - The compiler infers the datatype of the variable based on what's performed on the right side

  println(2 + 3 * 4)

  //Mathematical Expression: - + - * / & | ^ << >> >>> (Scala specific - right shift with zero extension)

  println(2 == addition)

  //Relational Expression: == != > >= < <=

  println(!(2 == addition))

  //Logical Expression: ! && ||

  var aValue = 2
  aValue += 3
  println(aValue)

  //The following can also be used: -= *= /=

  /* Everything in Scala is an Expression. Instructions are executed (Java, Python) vs Expressions are evaluated (Scala)
   * Don't ever use While loops in Scala code
   * */

  val someWeirdValue = (aValue = 5)
  println(someWeirdValue)

  //The datatype of someWeirdValue is Unit which is equivalent of Void in other programming languages. If we try to print the variable,
  //it wont return anything

  /* Declaring a variable with var keyword is a side effect in scala and usage of side effects will result in return of an Unit */

  //Examples of side effects are: println(), while loop, variable declaration with var keyword

  val someCodeBlock = {
    val x = 1
    val y = 2
    if (x + y == 2) "You are correct" else "Better luck next time"
  }

  //Code Blocks - Anything which is represented within the open & close brace is a code block. The scope of the variables stays within the block and
  //cannot be accessed outside the block

  //Exercise

  // 1. Difference between "hello world" and println("hello world")

  // Answer - println will return a unit where as the other will return an evaluated variable of type String

  // 2. What will be returned from the following code block?

  val someValue = { 2 < 3 }

  // Answer - someValue is of Boolean datatype and will return false

  // 3. What will be returned from the following code block?

  val someOtherValue = {
    if (someValue) 239 else 986
    42
  }

  //Answer - 42 - The last expression of the code block will always be returned.

}
