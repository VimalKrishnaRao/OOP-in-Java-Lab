import java.util.*;
public class ReplaceCharacter 
{
   public static void main(String args[])
   {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter a string value:");
      String str = sc.nextLine();
      System.out.print("Enter the character to be replaced:");
      char character = sc.nextLine().charAt(0);
      System.out.print("Enter the Character with which replacement has to be made:");
      char replacechar = sc.nextLine().charAt(0);
      String new_str=str.replace(character,replacechar);
      System.out.println("Final String is "+new_str);
   }
}
