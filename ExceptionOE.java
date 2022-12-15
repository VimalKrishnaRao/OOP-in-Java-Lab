import java.util.*;
class EvenNumberException extends Exception
{
    public EvenNumberException (int num)
    {
        
    }
}
class OddNumberException extends Exception
{
    public OddNumberException (int num)
    {
        
    }
}
class Main
{
    static void check (int num) throws EvenNumberException, OddNumberException
    {
        if (num%2==0)
        {
            throw new EvenNumberException (num);
        }
        else
        {
            throw new OddNumberException (num);
        }
    }
    public static void main (String args[])
    {
        Scanner sc = new Scanner (System.in);
        System.out.print ("Enter a number: ");
        int num = sc.nextInt();
        try 
        {
            check (num);
        } 
        catch (EvenNumberException e) 
        {
            System.out.println ("Caught EvenNumberException");
        }
        catch (OddNumberException e)
        {
            System.out.println ("Caught OddNumberException");
        }
    }
}
