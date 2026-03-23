/*

* * * * * 
* * * * 
* * * 
* * 
* 

 */


import java.util.*;
class pattern
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int num=n;
        for(int i=1;i<=num;i++)
        {
            for(int j=1;j<=n;j++)
            {
                System.out.print("* ");
            }
            n--;
            System.out.println();
        }
    }
} 