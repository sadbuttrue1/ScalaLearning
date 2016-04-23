package tk.sadbuttrue.chapter.six

/**
  * Created by true on 23/04/16.
  */
class Point(var x: Double, var y: Double)

object Point {
  def apply(x: Double, y: Double): Point = new Point(x, y)
}
