package tk.sadbuttrue.chapter.six

/**
  * Created by true on 23/04/16.
  */
object InchesToCentimeters extends UnitConversion{
  override def convert(value: Double): Double = value * 2.54
}
