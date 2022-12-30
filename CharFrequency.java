import java.util.Scanner;

class CharFrequency
{
  public static void main(String args[]) 
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a string:");
    String str = sc.nextLine();
    System.out.println("Enter a character whose frequemcy has to be found:");
    char c = sc.next().charAt(0);
    str = str.toLowerCase();
    c = Character.toLowerCase(c);
    int count = 0;
    for (int i = 0; i < str.length(); i++) 
    {
      if (str.charAt(i) == c) 
      {
        count++;
      }
    }
    System.out.println("Frequency of character '" + c + "' in string: " + count);
  }
}
