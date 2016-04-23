package tk.sadbuttrue.chapter.five

/**
  * Created by true on 23/04/16.
  */
class Car(val producer: String, val model: String, val issueYear: Int = -1, var registrationNumber: String = "") {
  //  def this(producer: String, model: String) {
  //    this(producer, model, -1, "")
  //  }
  //
  //  def this(producer: String, model: String, issueYear: Int) {
  //    this(producer, model, issueYear, "")
  //  }
  //
  //  def this(producer: String, model: String, registrationNumber: String) {
  //    this(producer, model, -1, registrationNumber)
  //  }

  override def toString = s"Car(producer=$producer, model=$model, issueYear=$issueYear, registrationNumber=$registrationNumber)"
}
