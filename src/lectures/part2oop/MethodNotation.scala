package lectures.part2oop

object MethodNotation extends App {

  class Person(val name: String, favouriteMovie: String, val age: Int = 0) {
    def likes(movie: String): Boolean = movie == favouriteMovie
    def marry(person: Person): String = s"$name is going to marry ${person.name}"
    def marry(nickName: String): Person = new Person(s"$name ($nickName)", favouriteMovie)
    def isAlive: Boolean = true
    def unary_+ : Person = new Person(name, favouriteMovie, age + 1)
    def learns(name: String): String = s"${this.name} is learning $name"
    def learnScala: String = this learns "Scala"

    def apply(): String = s"Hi, my name is $name and my age is ${this.age}.I like to watch $favouriteMovie"
    def apply(n: Int): String = s"$name watched $favouriteMovie $n times"
  }

  val somePerson = new Person("somePerson", "someMovie")
  val otherPerson = new Person("otherPerson", "otherMovie")
  println(somePerson.likes("someMovie"))
  println(somePerson likes "someMovie") //Infix Notation or Operator Notation - (Syntactic Sugar: Nicer way to write code rather than cumbersome way of coding)
  println(somePerson marry otherPerson)
  println(somePerson.isAlive)
  println(somePerson isAlive)
  println(somePerson.apply())
  println(somePerson()) //When the class is called like a method, compiler searches for apply method and executes it

  println((somePerson marry "the rockstar").apply())
  println((+somePerson).age)
  println(somePerson learnScala)
  println(somePerson(10))

  val someNegativeValue = -1 //Prefix Notation
  val someEquivalent = 1.unary_-

  // Unary Prefix will work only on -, +, ~, !

  /* The Infix notation will work only on methods with only one variable
  *  All the operators are methods in scala
  *  The Postfix notation will work only on methods without any parameter
  *
  * */

}
