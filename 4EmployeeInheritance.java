class Employee 
{
  String name;
  int age;
  long phoneNumber;
  String address;
  double salary;
  
  void printSalary() 
  {
    System.out.println("Salary: " + salary);
  }
}

class Officer extends Employee 
{
  String specialization;
}

class Manager extends Employee 
{
  String department;
}

public class Main 
{
  public static void main(String[] args) 
  {
    // Create an Officer object
    Officer officer = new Officer();
    officer.name = "Sarthak Bhatnagar";
    officer.age = 35;
    officer.phoneNumber = 1234567890;
    officer.address = "123 Main Street";
    officer.salary = 40000.0;
    officer.specialization = "Human Resources";
    
    // Print the officer's information
    System.out.println("Officer Information:");
    System.out.println("Name: " + officer.name);
    System.out.println("Age: " + officer.age);
    System.out.println("Phone Number: " + officer.phoneNumber);
    System.out.println("Address: " + officer.address);
    officer.printSalary();
    System.out.println("Specialization: " + officer.specialization);
    
    // Create a Manager object
    Manager manager = new Manager();
    manager.name = "Kaynath Sayaani";
    manager.age = 40;
    manager.phoneNumber = 9876543210;
    manager.address = "456 Market Street";
    manager.salary = 50000.0;
    manager.department = "Sales";
    
    // Print the manager's information
    System.out.println("\nManager Information:");
    System.out.println("Name: " + manager.name);
    System.out.println("Age: " + manager.age);
    System.out.println("Phone Number: " + manager.phoneNumber);
    System.out.println("Address: " + manager.address);
    manager.printSalary();
    System.out.println("Department: " + manager.department);
  }
}
