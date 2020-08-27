package exercises

object OOExercise extends App {

  val writerDetails = new Writer("someFirstName", "someSurName", 1965)
  val imposterDetails = new Writer("someFirstName", "someSurName", 1965)
  val novelDetails = new Novel("someNovel", 2020, writerDetails)

  println(writerDetails.fullName())
  println(novelDetails.authorAge())
  println(novelDetails.isWrittenBy(writerDetails))
  println(novelDetails.isWrittenBy(imposterDetails))
  novelDetails.copy(2021)

  val counterDetails = new Counter(123)
  val currentValue: Int = counterDetails.currentCount()
  println(currentValue)
  counterDetails.incrementCounter()
  counterDetails.decrementCounter()
  counterDetails.incrementCounter(2000)
}

class Writer(firstName: String, surname: String, val birthYear: Int) {
  def fullName(): String = firstName + " " + surname
}

class Novel(name: String, yearOfRelease: Int, author: Writer) {

  def authorAge(): Int = yearOfRelease - author.birthYear
  def isWrittenBy(author: Writer): Boolean = author == this.author
  def copy(newReleaseYear: Int) = new Novel(name, newReleaseYear, author)
}

class Counter(value: Int) {

  def currentCount(): Int = value

  def incrementCounter(): Counter = new Counter(value + 1)

  def decrementCounter(): Counter = new Counter(value - 1)

  def incrementCounter(amount: Int): Unit = println(s"The input value is $value and the amount value is $amount")
}
