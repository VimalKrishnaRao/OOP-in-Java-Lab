public class Employee 
{
  private String name;
  private int salary;

  public Employee(String name) 
  {
    this.name = name;
    this.salary = 10000;
  }

  public void display() 
  {
    System.out.println("Name of class is Employee.");
  }

  public void calcSalary() 
  {
    System.out.println("Salary of employee is " + salary);
  }
}

public class Engineer extends Employee 
{
  public Engineer(String name) 
  {
    super(name);
  }

  @Override
  public void calcSalary() 
  {
    System.out.println("Salary of employee is 20000");
  }
}

public class Main 
{
  public static void main(String args[]) 
  {
    Employee employee = new Engineer("Vimal");
    employee.display();
    employee.calcSalary();
  }
}
