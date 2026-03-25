import java.util.*;

public class pattern8 {
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        for(int i=0;i<n;i++)
        {
            int c=1;
            for(int p=0;p<=i;p++)
            {
                System.out.print(c+" ");
                c++;
            }
            for(int sp=i;sp<(n-1)*2;sp++)
            {
                System.out.print("  ");
            }
            
            for(int j=i;j>=0;j--)
            {
                System.out.print(" "+(j+1));
            }
            System.out.println();
        }
    }
}



/*

1             1
1 2         2 1
1 2 3     3 2 1 
1 2 3 4 4 3 2 1

*/
