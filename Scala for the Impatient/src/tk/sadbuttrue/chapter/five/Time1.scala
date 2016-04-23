package tk.sadbuttrue.chapter.five

/**
  * Created by true on 21/04/16.
  */
class Time1(val hours: Byte, val minutes: Byte) {
  def before(other: Time1): Boolean = if (other.hours < this.hours && other.minutes < this.minutes) true else false
}
