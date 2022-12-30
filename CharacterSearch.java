import java.util.Scanner;

class CharacterSearch
{
  public static void main(String[] args) 
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a string:");
    String str = sc.nextLine();
    System.out.println("Enter a character to search for:");
    char c = sc.next().charAt(0);
    str = str.toLowerCase();
    c = Character.toLowerCase(c);
    boolean found = false;
    for (int i = 0; i < str.length(); i++) 
    {
      if (str.charAt(i) == c) 
      {
        found = true;
        break;
      }
    }
    if (found) 
    {
      System.out.println("Character found in string.");
    } 
    else 
    {
      System.out.println("Character not found in string.");
    }
  }
}
