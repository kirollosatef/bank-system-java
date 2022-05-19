# bank-system-java 🏧🏦

    bank system with java (oop)
    i used #Inheritance , #Polymorphism , #Abstraction , #Interface
    => Console Application

    i'll add more feature later :)
    LIKE -> Database - GUI - methodes

## 1. Bank system class

    keep track of all customers (Array List), add new customer, 
    get information about all customers of this bank.

---

## 2. Customer class

    has name, id, phone number, accounts (Array List of accounts add account, show
    accounts methods to check/ change the customers information.

---

## 3. Account class

    has balance, currency, make a transfer, withdraw, deposit and Calc_balance(abstract method).
    There are two types of accounts, Checking account and Saving account.
    When creating any account type you must check that the balance at the creation time gearter
    than 1000 LE when the customer create any account with balance less than 1000 LE the program
    must throw LowBalanceException with a message “balance less than 1000 LE will not be allowed”
    then ask the user to enter at least 1000 LE then create the account.

    1.Saving account class: has interest rate =8% shared with all checking account customers, 
    updateInterestRate to change the interest rate for the bank’s saving account.

    2. Checking account class: this account allows the customer to withdraw even there has no
    balance to a limit equal 1000 LE, there is method to change the limit variable which is
    share with all checking account customers
