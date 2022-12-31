import java.util.Scanner;
class Circle 
{
  private double radius;

  public Circle(double radius) 
  {
    System.out.println("The perimeter of the circle is: " + (2 * Math.PI * radius));
  }
}

class Rectangle 
{
  private double width;
  private double height;

  public Rectangle(double width, double height) 
  {
    System.out.println("The perimeter of the rectangle is: " + (2 * (width + height)));
  }
}

public class Main 
{
  public static void main(String args[]) 
  {
    Scanner sc = new Scanner(System.in);

    System.out.println("Please select a shape: ");
    System.out.println("1. Circle");
    System.out.println("2. Rectangle");
    int shape = sc.nextInt();

    if (shape == 1) 
    {
      System.out.println("Enter the radius of the circle: ");
      double radius = sc.nextDouble();
      Circle circle = new Circle(radius);
    } 
    else if (shape == 2) 
    {
      System.out.println("Enter the width of the rectangle: ");
      double width = sc.nextDouble();
      System.out.println("Enter the height of the rectangle: ");
      double height = sc.nextDouble();
      Rectangle rectangle = new Rectangle(width, height);
    } 
    else 
    {
      System.out.println("Invalid shape selection.");
    }
  }
}
