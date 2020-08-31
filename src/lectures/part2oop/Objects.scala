package lectures.part2oop

object Objects extends App {

  object Person {
    val canFly: Boolean = false
  }

  println(Person.canFly)

  val somePerson = Person
  val someOtherPerson = Person

  println(somePerson.canFly)
  println(someOtherPerson.canFly)
  println(somePerson == someOtherPerson) //both somePerson & someOtherPerson are pointing to the same instance of the object

  /* Scala does not have any class level functionality. Instead scala has objects which are singleton instances
  *  Instance level & class level functionalities can be designed within the single scope with the same name and such concept is called as companion
  *  Scala does not have static values/methods */

}
