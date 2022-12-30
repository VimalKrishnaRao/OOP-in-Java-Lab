import java.util.Scanner;

class ReplaceCharacter
{
  public static void main(String args[]) 
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a string:");
    String str = sc.nextLine();
    System.out.println("Enter a character to replace:");
    char c1 = sc.next().charAt(0);
    System.out.println("Enter the replacement character:");
    char c2 = sc.next().charAt(0);
    str = str.toLowerCase();
    c1 = Character.toLowerCase(c1);
    c2 = Character.toLowerCase(c2);
    String result = "";
    for (int i = 0; i < str.length(); i++) 
    {
      if (str.charAt(i) == c1) 
      {
        result += c2;
      } 
      else 
      {
        result += str.charAt(i);
      }
    }
    System.out.println("Modified string: " + result);
  }
}
