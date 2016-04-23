package tk.sadbuttrue.chapter.five

/**
  * Created by true on 21/04/16.
  */
class Counter {
  private var value = 0

  def increment() {
    if (value < Int.MaxValue) value += 1
    else println("Max value exceeded")
  }

  def current = value
}
