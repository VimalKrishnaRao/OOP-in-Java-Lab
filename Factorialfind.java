import java.util.Scanner;
class Factorial
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner (System.in);
        System.out.println ("Enter the Number:");
            int n = sc.nextInt();
        int i,f;
        for (i=1, f=1; i<=n; f=f*i, i++);
        System.out.println ("The Factorial of "+n+" is: "+f);
    }
}
