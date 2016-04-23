package tk.sadbuttrue.chapter.six

/**
  * Created by true on 23/04/16.
  */
object Suit extends Enumeration {
  type Suit = Value
  val Hearts = Value("♥")
  val Diamonds = Value("♦")
  val Clubs = Value("♣︎")
  val Spades = Value("♠")

  def isRed(suit: Suit) = if (suit == Hearts || suit == Diamonds) true else false
}
