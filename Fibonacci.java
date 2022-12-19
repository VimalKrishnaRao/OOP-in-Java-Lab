import java.util.Scanner;
class Fibonacci
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner (System.in);
        System.out.println ("Enter the Limit:");
            int n = sc.nextInt();
        int a=0, b=1, c, count =2;
        System.out.println ("The Fibonacci Series of limit "+n+" is:");
        System.out.print (a+"\t"+b);
        for (; count<n; a=b, b=c)
        {
            c=a+b;
            System.out.print ("\t"+c);
            count++;
        }
    }
}
