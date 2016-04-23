package tk.sadbuttrue.chapter.five

/**
  * Created by true on 23/04/16.
  */
class Person(initialAge: Int) {
  private var privateAge = if (initialAge < 0) 0 else initialAge

  def age = privateAge

  def age_=(newAge: Int) {
    if (newAge > privateAge) privateAge = newAge
  }

}
