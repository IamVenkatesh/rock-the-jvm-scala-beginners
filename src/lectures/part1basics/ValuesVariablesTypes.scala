package lectures.part1basics

object ValuesVariablesTypes extends App {

  val x: Int = 42
  println(x)

  //The variable defined with val keyword are immutable

  val y = 42
  println(y)

  //Compiler infers the datatype in this case

  val someBoolean: Boolean = true
  val someChar: Char = 'a'
  val someInt: Int = x
  val someShort: Short = 9999
  val someLong: Long = 5787793797496293496L
  val someFloat: Float = 2.0f
  val someDouble: Double = 3.14

  //Different datatype's available in scala

  var someInteger: Int = 3

  someInteger = 5

  //The variable defined with var keyword are mutable
  
}
