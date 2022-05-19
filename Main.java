import Packages.*;

public class Main {
  public static void main(String[] args) {
    // add 2 customers to the bank system:
    BankSystem bankSystem = new BankSystem();
    Customer customer1 = new Customer("John", 1, "0123456789");
    Customer customer2 = new Customer("Mary", 2, "9876543210");
    // add 2 SavingAcouunt to customer1:
    SavingAccount savingAccount1 = new SavingAccount(1, "USD");
    SavingAccount savingAccount2 = new SavingAccount(2, "USD");
    // add accounts to the bank system:
    customer1.addAccount(savingAccount1);
    customer2.addAccount(savingAccount2);
    // add accounts to the bank system:
    bankSystem.addCustomer(customer1);
    bankSystem.addCustomer(customer2);
    // print the bank system:
    bankSystem.showCustomers();
  }
}