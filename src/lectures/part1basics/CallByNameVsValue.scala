package lectures.part1basics

object CallByNameVsValue extends App {

  def callByValue(x: Long): Unit = {
    println(s"the current call by value is: $x")
    println(s"the current call by value is: $x")
  }

  def callByName(x: => Long): Unit = {
    println(s"the current call by name is: $x")
    println(s"the current call by name is: $x")
  }

  callByValue(System.nanoTime()) //both the print statement will return same value

  callByName(System.nanoTime()) //both the print statement will return different value

  /*
  * Call By Value will be evaluated first and will be used every time you call the variable inside the scope of the function
  * Call By Name will be evaluated every time the variable is called insider the scope of the function */

  def infinite(): Int = 1 + infinite()

  def somePrintStatement(x: Int, y: => Int): Unit = println(x)

  //somePrintStatement(infinite(), 14)
  // The program will error out with the stack overflow error as the program tried to evaluate the value for x and it enters an infinite loop

  somePrintStatement(14, infinite())

  // The program executes without the stack overflow error as the variable y was never called inside scope of the function and hence it was not
  // evaluated

}
