import java.util.*;
class CharFrequency
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the String:");
		String str=sc.nextLine();
		System.out.println("Enter the character:");
		char c=sc.nextLine().charAt(0);
		int count=0;
		for (int i=0;i<str.length();i++)
		{
			if (c==str.charAt(i))
			{
				count++;
			}
		}		
		System.out.println("Frequency of "+c+" in "+str+" is "+count);
	}
}
