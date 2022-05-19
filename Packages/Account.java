package Packages;

// Account class:
abstract public class Account {
  double balance;
  String currency;
  double limit = 1000;
  double interestRate;

  public Account(double balance, String currency) {
    if (balance < limit) {
      System.out.println("You don't have enough money to open an account plese deposit at least " + limit);
      return;
    } else {
      this.balance = balance;
      this.currency = currency;
    }
  }

  // setters:
  public void setBalance(double balance) {
    this.balance = balance;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  // getters:
  public double getBalance() {
    return balance;
  }

  public String getCurrency() {
    return currency;
  }

  // methods:
  abstract void Transfer(double amount, Account account);

  abstract void Withdraw(double amount);

  abstract void Deposit(double amount);

  abstract double Calc_balance();

  // toString method:
  public String toString() {
    return "Account balance: " + balance + " " + currency;
  }
}