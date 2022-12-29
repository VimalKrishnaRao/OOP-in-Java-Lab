public class ExceptionHandlingDemo 
{
  public static void main(String args[]) 
  {
    // Demonstrate exception handling for an arithmetic exception
    try 
    {
      int x = 10;
      int y = 0;
      int z = x / y;
      System.out.println("Result: " + z);
    } 
    catch (ArithmeticException e) 
    {
      System.out.println("An arithmetic exception occurred: " + e.getMessage());
    }

    // Demonstrate exception handling for an array out of index exception
    try 
    {
      int numbers[] = new int[5];
      numbers[10] = 100;
    } 
    catch (ArrayIndexOutOfBoundsException e) 
    {
      System.out.println("An array out of index exception occurred: " + e.getMessage());
    }
  }
}
