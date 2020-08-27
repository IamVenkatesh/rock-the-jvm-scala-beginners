package lectures.part2oop

object OOBasics extends App {

  val somePerson = new Person("Dave", 12)
  println(somePerson.someValue)

  somePerson.greet("John")

  // If we want the name parameter of the class to be used, then we have to mention as follows
  somePerson.greetClassParameter("John")

  somePerson.greet()
}

class Person(name: String, age: Int) {
  val someValue: Int = 2
  println("I am being evaluated")

  def greet(name: String): Unit = println(s"$name says: Hi $name, How are you?")

  def greetClassParameter(name: String): Unit = println(s"${this.name} says: Hi $name, How are you?")

  def greet(): Unit = println(s"Hi $name, How are you?")
}

/* The Parameters passed to the person class is called as constructor. Unlike other languages we cannot access the parameters of a class a field/variable
 * To access the parameter as a field/variable the val/var keyword should be specified i.e. class Person(name: String, val age: Int) and the same can now be accessed as println(somePerson.age)
 * The variables inside the class can be accessed once the class is instantiated. When ever a class is instantiated the class will be evaluated which has resulted in the print statement
 * To access the parameter of the class inside a function, we can refer it using this keyword
 * Only if the class variable names are same, then we need to use this keyword. If the variable names are different, then using this keyword does not make sense as the compiler will implicitly refer the same.
 * If we notice the class has two methods/functions with the same name. As long as the function signature is different the compiler wont be confused. This is called overloading.
 * If we define two methods with same parameter list but different return types, the compiler will not accept the same.
 *  */
