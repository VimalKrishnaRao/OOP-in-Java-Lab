public abstract class Shape 
{
  public abstract void numberOfSides();
}

public class Rectangle extends Shape 
{
  @Override
  public void numberOfSides() 
  {
    System.out.println("A rectangle has 4 sides.");
  }
}

public class Triangle extends Shape 
{
  @Override
  public void numberOfSides() 
  {
    System.out.println("A triangle has 3 sides.");
  }
}

public class Hexagon extends Shape 
{
  @Override
  public void numberOfSides() 
  {
    System.out.println("A hexagon has 6 sides.");
  }
}

public class Main 
{
  public static void main(String args[]) 
  {
    Shape rectangle = new Rectangle();
    rectangle.numberOfSides();

    Shape triangle = new Triangle();
    triangle.numberOfSides();

    Shape hexagon = new Hexagon();
    hexagon.numberOfSides();
  }
}
