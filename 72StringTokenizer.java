import java.io.*;
import java.util.StringTokenizer;

public class Main 
{
  public static void main(String args[]) throws IOException 
  {
    // Read the line of integers from the file
    BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
    String line = reader.readLine();
    reader.close();

    // Use the StringTokenizer to parse the line of integers
    StringTokenizer tokenizer = new StringTokenizer(line);

    // Initialize the sum to zero
    int sum = 0;

    // Iterate through each token (integer)
    while (tokenizer.hasMoreTokens()) 
    {
      // Get the next token and parse it as an integer
      int num = Integer.parseInt(tokenizer.nextToken());

      // Add the integer to the sum
      sum += num;

      // Print the integer
      System.out.println(num);
    }

    // Print the sum
    System.out.println("Sum: " + sum);
  }
}
