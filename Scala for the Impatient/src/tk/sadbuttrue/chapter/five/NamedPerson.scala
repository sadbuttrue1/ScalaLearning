package tk.sadbuttrue.chapter.five

/**
  * Created by true on 23/04/16.
  */
class NamedPerson(fullName: String) {
  val firstName = fullName.split(' ')(0)
  val lastName = fullName.split(' ')(1)
}
