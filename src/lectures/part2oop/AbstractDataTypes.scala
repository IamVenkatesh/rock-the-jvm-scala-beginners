package lectures.part2oop

object AbstractDataTypes extends App {

  abstract class Animal {
    val creature: String
    val eat: String
    val preferredMeal: String = "Meat"
  }

  class Dog extends Animal {
    override val creature: String = "Dog"
    override val eat: String = "Crunch Crunch"
  }

  //Traits

  trait Carnivore {
    val preferredFood: String = "Meat"
    def eat(animal: Animal): String
  }

  class Crocodile extends Animal with Carnivore {
    override val creature: String = "Crocodile"
    override val eat: String = "Chow Chow"
    def eat(animal: Animal): String = s"I am a $creature and I am eating ${animal.creature} as my diet is $preferredFood"
  }

  val dog = new Dog
  val crocodile = new Crocodile
  println(crocodile.eat(dog))

  /* Abstract Classes cannot be instantiated
  *  Abstract Classes can have both abstract and non abstract members
  *  Traits can have both abstract and non abstract members
  *  Traits cannot have constructors & multiple traits can be inherited & traits are behaviour */
}
