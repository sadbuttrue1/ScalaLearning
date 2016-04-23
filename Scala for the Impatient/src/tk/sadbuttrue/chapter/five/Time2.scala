package tk.sadbuttrue.chapter.five

/**
  * Created by true on 21/04/16.
  */
class Time2(hours: Byte, minutes: Byte) {
  private val time = hours * 60 + minutes

  def before(other: Time2): Boolean = if (other.time < this.time) true else false
}
