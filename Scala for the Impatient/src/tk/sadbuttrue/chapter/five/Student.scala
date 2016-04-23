package tk.sadbuttrue.chapter.five

import scala.beans.BeanProperty

/**
  * Created by true on 21/04/16.
  */
class Student {
  @BeanProperty var name: String = ""
  @BeanProperty var id: Long = 0
}
