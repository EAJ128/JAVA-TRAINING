import java.util.*;

class Intro
{
    public static void main(String[] args)
    {
        task1();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(n);
        task2();
        
    }
    static void task1()
    {
        for(int i=0;i<5;i++)
        {
            System.out.println("From TASK 1"+(i+1));
        }
    }
    static void task2()
    {
        for(int i=0;i<5;i++)
        {
            System.out.println("From TASK 2"+(i+1));
        }
    }

}