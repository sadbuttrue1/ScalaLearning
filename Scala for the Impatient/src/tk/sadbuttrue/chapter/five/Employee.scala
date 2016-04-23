package tk.sadbuttrue.chapter.five

/**
  * Created by true on 23/04/16.
  */
class Employee(val name: String, var salary: Double) {
  def this() {
    this("John Q. Public", 0.0)
  }
}

class EmployeeExplicit {
  val name: String = ""
  var salary: Double = 0
}