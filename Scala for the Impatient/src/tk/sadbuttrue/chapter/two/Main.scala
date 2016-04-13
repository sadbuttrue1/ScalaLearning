package tk.sadbuttrue.chapter.two

/**
  * Created by true on 13/04/16.
  */
object Main extends App {
  //  Task 1
  def signum(n: Int) = {
    if (n == 0) 0
    else if (n > 0) 1
    else -1
  }

  println(signum(0))
  println(signum(10))
  println(signum(-10))

  //  Task 2
  println({})

  //  Task 3
  var x: Unit = ()
  var y = 0
  x = y = 1

  //  Task 4
  for (i <- (0 to 10) reverse) {
    println(i)
  }

  //  Task 5
  def countdown(n: Int): Unit = {
    for (i <- (0 to n) reverse) println(i)
  }

  countdown(5)

  //  Task 6
  var v: Long = 1
  val s = "Hello"
  for (c <- s) v *= c
  println(v)

  //  Task 7
  v = s.foldLeft(1l)((a, b) => a * b)
  println(v)

  //  Task 8
  def product(s: String): Long = {
    s.foldLeft(1l)((a, b) => a * b)
  }

  v = product(s)
  println(v)

  // Task 9
  def recProduct(s: String): Long = {
    if (s.length == 0) 1
    else s.head * recProduct(s.tail)
  }

  v = recProduct(s)
  println(v)

  //  Task 10
  def expo(x: BigDecimal, n: BigInt): BigDecimal = {
    if (n > 0) {
      if (n % 2 == 0) {
        val y = expo(x, n / 2)
        y * y
      }
      else x * expo(x, n - 1)
    } else {
      if (n == 0) 1
      else 1 / expo(x, -n)
    }
  }

  println(expo(2, 0))
  println(expo(2, 1024))

}
