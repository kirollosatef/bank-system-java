package Packages;

// Checking account class:
public class CheckingAccount extends Account {
  public CheckingAccount(double balance, String currency) {
    super(balance, currency);
    limit = 1000;
  }

  public void UpdateLimit(double newLimit) {
    limit = newLimit;
  }

  public void Transfer(double amount, Account account) {
    if (amount > balance) {
      System.out.println("You don't have enough money to transfer");
    } else {
      balance -= amount;
      account.balance += amount;
    }
  }

  public void Withdraw(double amount) {
    if (amount > balance) {
      System.out.println("You don't have enough money to withdraw");
    } else {
      balance -= amount;
    }
  }

  public void Deposit(double amount) {
    balance += amount;
  }

  public double Calc_balance() {
    return balance;
  }
}