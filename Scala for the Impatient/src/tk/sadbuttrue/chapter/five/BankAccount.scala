package tk.sadbuttrue.chapter.five

/**
  * Created by true on 21/04/16.
  */
class BankAccount {
  private var balance: Double = 0

  def currentBalance = balance

  def deposit(value: Double) = {
    balance += value
  }

  def withdraw(value: Double) = {
    if (value > balance) println("Not enough money")
    else balance -= value
  }
}
