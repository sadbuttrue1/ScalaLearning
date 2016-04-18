package tk.sadbuttrue.chapter.four

import java.io.File
import java.util
import java.util.{Calendar, Scanner}

import scala.collection.mutable

/**
  * Created by true on 18/04/16.
  */
object Main extends App {
  //  Task 1
  val prices = scala.collection.mutable.HashMap("Stem" -> 100, "Saddle" -> 19, "Handlebar" -> 150, "Jersey" -> 120)
  val discontinuedPrices = for ((item, price) <- prices) yield (item, price * 0.9)
  println(discontinuedPrices)

  //  Task 2
  val ipsumFile = new File("test.txt")
  var in = new Scanner(ipsumFile)
  val wordsCount = new scala.collection.mutable.HashMap[String, Int]
  while (in.hasNext) {
    val word = in.next()
    if (wordsCount.contains(word)) wordsCount(word) += 1
    else wordsCount(word) = 1
  }
  for ((word, count) <- wordsCount) printf("Word %s met %d times\n", word, count)
  in.close()

  //  Task 3
  in = new Scanner(ipsumFile)
  val words = new mutable.MutableList[String]
  while (in.hasNext) words += in.next
  var freq = new collection.immutable.HashMap[String, Int]
  for (word <- words) freq = freq + (word -> (freq.getOrElse(word, 0) + 1))
  for ((word, count) <- freq) printf("Word %s met %d times\n", word, count)
  in.close()

  //  Task 4
  in = new Scanner(ipsumFile)
  var sortedFreq = collection.immutable.SortedMap.empty[String, Int]
  for (word <- words) sortedFreq = sortedFreq + (word -> (sortedFreq.getOrElse(word, 0) + 1))
  for ((word, count) <- sortedFreq) printf("Word %s met %d times\n", word, count)
  in.close()

  //  Task 5
  import scala.collection.JavaConversions._

  in = new Scanner(ipsumFile)
  val treeFreq: collection.mutable.Map[String, Int] = new util.TreeMap[String, Int]
  while (in.hasNext) {
    val word = in.next()
    treeFreq += (word -> (treeFreq.getOrElse(word, 0) + 1))
  }
  for ((word, count) <- treeFreq) printf("Word %s met %d times\n", word, count)
  in.close()

  //  Task 6
  val weekdays = mutable.LinkedHashMap(
    "Monday" -> Calendar.MONDAY,
    "Tuesday" -> Calendar.TUESDAY,
    "Wednesday" -> Calendar.WEDNESDAY,
    "Thursday" -> Calendar.THURSDAY,
    "Friday" -> Calendar.FRIDAY,
    "Saturday" -> Calendar.SATURDAY,
    "Sunday" -> Calendar.SUNDAY
  )
  for (weekday <- weekdays) println(weekday)

  //  Task 7
  import scala.collection.JavaConversions._

  val props: collection.Map[String, String] = System.getProperties
  val longestName = props.keys.maxBy(_.length).length
  for ((name, value) <- props) {
    val separator = " " * (longestName - name.length)
    printf("%s%s| %s\n", name, separator, value)
  }

  //  Task 8
  def minmax(values: Array[Int]) = {
    val min = values.min
    val max = values.max
    (min, max)
  }

  val arr = Array(842, 8, 91919, -19, 100500, -144294)
  println(minmax(arr))

  //  Task 9
  def lteqgt(values: Array[Int], v: Int) = {
    val less = values.count(_ < v)
    val equal = values.count(_ == v)
    val greater = values.count(_ > v)
    (less, equal, greater)
  }

  println(lteqgt(arr, 8))

  //  Task 10
  println("Hello".zip("Word"))
  val caseConverter = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".zip("abcdefghijklmnopqrstuvwxyz").toMap
  var lower = caseConverter('D')
  println(lower)
}
