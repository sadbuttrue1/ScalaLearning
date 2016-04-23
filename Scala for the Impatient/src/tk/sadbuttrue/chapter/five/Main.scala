package tk.sadbuttrue.chapter.five

/**
  * Created by true on 21/04/16.
  */
object Main extends App {
  //  Task 1
  val counter: Counter = new Counter
  for (i <- 1 to Int.MaxValue) counter.increment()
  println(counter.current)
  counter.increment()
  println(counter.current)

  //  Task 2
  val bankAccount: BankAccount = new BankAccount
  println(bankAccount.currentBalance)
  bankAccount.deposit(100)
  println(bankAccount.currentBalance)
  bankAccount.withdraw(1000)
  println(bankAccount.currentBalance)
  bankAccount.withdraw(10)
  println(bankAccount.currentBalance)

  //  Task 3
  val time11 = new Time1(21, 21)
  val time12 = new Time1(22, 21)
  println(time11.before(time12))
  val time13 = new Time1(10, 1)
  println(time11.before(time13))

  //  Task 4
  val time21 = new Time2(21, 21)
  val time22 = new Time2(22, 21)
  println(time21.before(time22))
  val time23 = new Time2(10, 1)
  println(time21.before(time23))

  //  Task 5
  val student = new Student
  student.id = 10
  println(student.id)
  student.setId(100)
  println(student.getId)
  student.name = "Ivan"
  println(student.name)
  student.setName("Ioan")
  println(student.getName)

  //  Task 6
  val fred = new Person(-10)
  println(fred.age)
  fred.age = 10
  println(fred.age)

  //  Task 7
  val fredSmith = new NamedPerson("Fred Smith")
  println(fredSmith.firstName)
  println(fredSmith.lastName)

  //  Task 8
  val civic = new Car("Honda", "Civic", 1993, "fkdjfk")
  println(civic)
  civic.registrationNumber = "TEST"
  println(civic)
  println(new Car("Ford", "F-150", 2001))
  println(new Car("Lada", "Vesta", registrationNumber = "e123kh"))

  //  Task 9
  val javaCivic = new JavaCar("Honda", "Civic", 1993, "fkdjfk")
  println(javaCivic)
  javaCivic.setRegistrationNumber("TEST")
  println(javaCivic)
  println(new JavaCar("Ford", "F-150", 2001))
  println(new JavaCar("Lada", "Vesta", "e123kh"))
}
