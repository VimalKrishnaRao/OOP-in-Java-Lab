import java.util.Scanner;
class Prime
{
    int checkprime (int n)
    {
        if(n<2)
            return 0;
        if (n%2==0)
            return 0;
        for (int i=3; i<n/2; i=i+2)
            if (n%i==0)
                return 0;
            return 1;
    }
    public static void main (String args[])
    {
        Scanner sc = new Scanner (System.in);
        System.out.println ("Enter the Number to be checked:");
            int n = sc.nextInt();
        Prime obj = new Prime();
        int a = obj.checkprime(n);
        if (a==0)
            System.out.println (n+" is not a Prime Number");
        else
            System.out.println (n+" is a Prime Number");
    }
}
