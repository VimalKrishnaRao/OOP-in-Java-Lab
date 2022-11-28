import java.util.*;
class CharIndex
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String:");
        String str=sc.nextLine();
        System.out.println("Enter the character to be searched:");
        char c=sc.next().charAt(0);
        int index=str.indexOf(c);
        if (index==-1)
            System.out.println("Character "+c+" is not present in the String: "+str);
        else
            System.out.println("Character "+c+" is present in the string: "+str+", whose First occurence takes place "+index+"th Position");
    }
}
