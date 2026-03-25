import java.util.*;

public class pattern2 {
    public static void main(String[] args) {
        {
            Scanner s=new Scanner(System.in);
            int n=s.nextInt();
            int c=1;
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<=i;j++)
                {
                    System.out.print(c+" ");
                    c++;
                }
                System.out.println();
            }
        }
    }
}
