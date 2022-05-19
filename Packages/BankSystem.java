package Packages;

import java.util.*;

// Bank system class: keep track of all customers (Array List), add new customer, get
// information about all customers of this bank
public class BankSystem {
  ArrayList<Customer> customers;

  // Constructor:
  public BankSystem() {
    this.customers = new ArrayList<Customer>();
  }

  // add customer method:
  public void addCustomer(Customer customer) {
    this.customers.add(customer);
  }

  // get customer by id method:
  public Customer getCustomer(int id) {
    for (Customer customer : this.customers) {
      if (customer.getId() == id) {
        return customer;
      }
    }
    return null;
  }

  // get all customers method:
  public void showCustomers() {
    String output = "";
    for (Customer customer : this.customers) {
      output += customer.toString() + "\n";
    }
    System.out.println(output);
  }
}