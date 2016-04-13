package tk.sadbuttrue.chapter.three

import scala.collection.mutable.ArrayBuffer

/**
  * Created by true on 13/04/16.
  */
object Main extends App {
  //Task 1
  val a = ArrayBuffer[Int]()
  val n = 11
  for (i <- 0 until n) a += i
  println(a)

  //  Task 2
  for (i <- 0 until n if i % 2 == 1) {
    val tmp = a(i)
    a(i) = a(i - 1)
    a(i - 1) = tmp
  }
  println(a)

  //  Task 3
  val b = for (i <- 0 until n) yield {
    if (i % 2 == 1) a(i - 1)
    else if (i + 1 < a.length - 1) a(i + 1)
    else a(i)
  }
  println(b)

  //  Task 4
  val c = Array(1, 3, 49, -19, -93991, 8, 8383, 0, 0, -1)
  val d = ArrayBuffer[Int]()
  d ++= c.filter(_ > 0)
  d ++= c.filter(_ <= 0)
  println(c.mkString("(", ",", ")"))
  println(d)

  //  Task 5
  val avg = d.sum / d.length
  println(avg)

  //  Task 6
  val e = d.sortWith(_ < _)
  println(e)

  //  Task 7
  val f = e.distinct
  println(f)

  //  Task 8
  //  var first = true
  //  val indexes = for (i <- d.indices if first || d(i) >= 0) yield {
  //    if (d(i) < 0) first = false; i
  //  }
  //  for (j <- indexes.indices) d(j) = d(indexes(j))
  //  d.trimEnd(d.length - indexes.length)
  //  println(d)
  //  var first = true
  var indexes = for (i <- d.indices if d(i) < 0) yield i
  indexes = indexes.tail.reverse
  for (j <- indexes.indices) d.remove(indexes(j))
  println(d)

  //  Task 9
  import java.util.TimeZone._

  println(getAvailableIDs.filter(_.contains("America/")).map(_.replace("America/", "")).sorted.mkString(","))

  //  Task 10
  import java.awt.datatransfer._
  import scala.collection.mutable.Buffer
  import scala.collection.JavaConversions._

  val flavors = SystemFlavorMap.getDefaultFlavorMap.asInstanceOf[SystemFlavorMap]
  val nativeFlavors: Buffer[String] = flavors.getNativesForFlavor(DataFlavor.imageFlavor)
  println(nativeFlavors)
}
