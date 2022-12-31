import java.util.Scanner;

class Student 
{
    String name;
    int rollNo;
    int marks[] = new int[5];

    void read() 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Student's name: ");
        name = sc.nextLine();
        System.out.print("Enter Student's roll number: ");
        rollNo = sc.nextInt();
        System.out.println("Enter marks in 5 subjects: ");
        for (int i = 0; i < 5; i++) 
        {
            marks[i] = sc.nextInt();
        }
    }

    void display() 
    {
        System.out.println("Name: " + name);
        System.out.println("Roll number: " + rollNo);
        System.out.println("Marks in 5 subjects: ");
        for (int i = 0; i < 5; i++) 
        {
            System.out.println(marks[i]);
        }
    }
}

class Main 
{
    public static void main(String args[]) 
    {
        Student s = new Student();
        s.read();
        s.display();
    }
}
