import java.util.*;

public class pattern6 {
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        for(int i=n-1;i>=0;i--)
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
