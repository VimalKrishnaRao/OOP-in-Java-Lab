import java.util.Scanner;
public class Main
{
  public static double calculateArea(double radius) 
  {
    return Math.PI * radius * radius;
  }
  public static double calculateArea(double length, double width) 
  {
    return length * width;
  }
  public static double calculateArea(double a, double b, double c) 
  {
    double s = (a + b + c) / 2;
    return Math.sqrt(s * (s - a) * (s - b) * (s - c));
  }

  public static void main(String args[]) 
  {
      Scanner sc = new Scanner (System.in);
      int choice;
      do
      {
          System.out.println ("-----Menu-----");
          System.out.println ("Select the Polygon whose area has to be calculated: ");
          System.out.println ("1. Circle\n2. Rectangle\n3. Triangle\n4. Exit");
          System.out.println ("Enter your Choice:");
          choice = sc.nextInt();
          switch (choice)
          {
              case 1: System.out.println ("Enter the Radius of Circle: ");
                      double r = sc.nextInt();
                      System.out.println("Area of the Circle: " + calculateArea(r));
                      break;
              case 2: System.out.println ("Enter the Base & Height of Rectangle: ");
                      double b = sc.nextInt();
                      double h = sc.nextInt();
                      System.out.println("Area of the Rectangle: " + calculateArea(b, h));
                      break;
              case 3: System.out.println ("Enter the 3 Sides of Triangle: ");
                      double x = sc.nextInt();
                      double y = sc.nextInt();
                      double z = sc.nextInt();
                      System.out.println("Area of the Rectangle: " + calculateArea(x, y, z));
                      break;
              case 4: break;
              default: System.out.println ("Invalid Choice, Try Again");
          }
      }
      while (choice!=4);
  }
}
    
