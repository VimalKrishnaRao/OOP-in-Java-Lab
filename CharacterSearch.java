import java.util.*;
class CharacterSearch
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String:");
		String str=sc.nextLine();
		System.out.println("Enter the Character to be searched:");
		char c=sc.nextLine().charAt(0);
		int index=str.indexOf(c);
		if (index!=-1)
			System.out.println("Character "+c+" is present in the string "+str);
		else
			System.out.println("Character "+c+" is present in the string "+str);
	}
}
