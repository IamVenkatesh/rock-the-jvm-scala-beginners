package lectures.part1basics

object StringOperation extends App {

  val name: String = "Dave"
  val age: Int = 12

  println(s"Hello, my name is $name and I am $age years old.")
  println(s"Hello, my name is $name and I will be turning ${age + 1} years soon.")
  // s - is a string interpolator which helps me use the variables inside a string.

  val speed = 1.587f

  println(f"$name can eat $speed%2.2f burgers per minute")

  // f - is also a string interpolator which helps in setting the floating point precision
  // notice that the 1.587 is enforced to a precision of two decimal digits in the output

  println("I am learning \t scala!")
  println(raw"I am learning \t scala!")

  // The escape character is not considered when raw is used as a string interpolator. Notice the difference between the above println
  // statements

  val str: String = "I am learning \t scala!"
  println(raw"$str")

  // But when we use raw with the injected variables, the escape characters are enforced.

}
