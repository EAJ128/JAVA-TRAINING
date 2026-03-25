import java.util.*;

public class pattern5 {
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        for(int i=0;i<n;i++)
        {
            for(int sp=0;sp<n-i;sp++)
            {
                System.out.print("  ");
            }
            for(int p=1;p<=(2*i)+1;p++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
