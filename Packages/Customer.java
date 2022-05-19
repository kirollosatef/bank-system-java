package Packages;

import java.util.*;

// Customer class: has name, id, phone number, accounts (Array List of accounts), add
// account, show accounts methods to check/ change the customers information.
public class Customer {
  String name;
  int id;
  String phoneNumber;
  ArrayList<Account> accounts;

  // Constructor:
  public Customer(String name, int id, String phoneNumber) {
    this.name = name;
    this.id = id;
    this.phoneNumber = phoneNumber;
    this.accounts = new ArrayList<Account>();
  }

  // add account method:
  public void addAccount(Account account) {
    this.accounts.add(account);
  }

  // show accounts method:
  public void showAccounts() {
    for (Account account : this.accounts) {
      System.out.println(account);
    }
  }

  // getters:
  public String getName() {
    return name;
  }

  public int getId() {
    return id;
  }

  public String getPhoneNumber() {
    return phoneNumber;
  }

  // setters:
  public void setName(String name) {
    this.name = name;
  }

  public void setId(int id) {
    this.id = id;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  // toString method:
  public String toString() {
    String accounts = "";
    if (this.accounts.size() == 0) {
      accounts = "you don't have any accounts";
      return "Customer name: " + name + " id: " + id + " phone number: " + phoneNumber + "\nAccounts: \n" + accounts;
    }
    for (Account account : this.accounts) {
      accounts += account.toString() + "\n";
    }
    return "Customer name: " + name + " id: " + id + " phone number: " + phoneNumber + "\nAccounts: \n" + accounts;
  }
}