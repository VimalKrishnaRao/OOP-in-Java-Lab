import java.util.*;
class Palindrome
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String:");
		String string=sc.nextLine();
		int l=string.length();
		String reverse="";
		int i;
		for(i=l-1;i>=0;i--)
		reverse=reverse+string.charAt(i);
		if(string.equalsIgnoreCase(reverse))
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println(" Not  Palindrome");
		}
	}
}
