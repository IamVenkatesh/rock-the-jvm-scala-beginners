package lectures.part2oop

object Inheritance extends App {

  class Animal {

    val classification: String = "Wild"

    def eat: Unit = print("I am eating in Public!")

    private def eatPrivate: Unit = println("I am eating in Private!")

    protected def eatProtected: Unit = println("I am eating in Protected space!")

    eatPrivate

    eatProtected
  }

  class Dog extends Animal {

    def sound: Unit = println("Bow Bow!!")

    override def eat: Unit = println("Crunch Crunch!")

    override val classification: String = "Domestic"
  }

  val dogInstance = new Dog
  dogInstance.eat
  println(dogInstance.classification)
  val animalInstance = new Animal
  println(animalInstance.classification)

  //CONSTRUCTORS

  class Person(name: String, age: Int) {
    def this(name: String) = this(name, 0)
  }
  class Adult(name: String, age: Int, idCard: Boolean) extends Person(name, age)
  class AdultConstruct(name: String, age: Int, idCard: Boolean) extends Person(name)

  // Type Substitution - Polymorphism
  val someOtherAnimal: Animal = new Dog
  someOtherAnimal.eat
  println(someOtherAnimal.classification)


  /* There are 3 types to access the methods inside a class during inheritance - Public, Private & Protected
  *  Public - can be accessed in Subclass & any instances of the new baseclass/super class
  *  Private - can be accessed only inside the scope of the base class
  *  Protected - can be accessed on either base class or sub class but not on the new instantiations
  *  Has examples for overriding and constructors
  *  Use Super to access/use methods in base class
  *  Prevent Override : Use Final keyword, Use Final to prevent class being Inherited, Seal the class - can be inherited only in this file */
}
