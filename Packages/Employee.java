package Packages;

// Employee class: has name, salary, id and any functions to access/change his information.
public class Employee {
  String name;
  double salary;
  int id;

  Employee(String name, double salary, int id) {
    this.name = name;
    this.salary = salary;
    this.id = id;
  }

  void setName(String name) {
    this.name = name;
  }

  void setSalary(double salary) {
    this.salary = salary;
  }

  void setId(int id) {
    this.id = id;
  }

  String getName() {
    return this.name;
  }

  double getSalary() {
    return this.salary;
  }

  int getId() {
    return this.id;
  }

  void printInfo() {
    System.out.println("Name: " + this.name);
    System.out.println("Salary: " + this.salary);
    System.out.println("Id: " + this.id);
  }
}