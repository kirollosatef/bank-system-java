package Packages;

//Saving account class:
public class SavingAccount extends Account {

  public SavingAccount(double balance, String currency) {
    super(balance, currency);
    interestRate = 0.08;
  }

  public void UpdateInterestRate(double newRate) {
    interestRate = newRate;
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