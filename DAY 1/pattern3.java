import java.util.*;

public class pattern3 {
    public static void main(String[] args) {
        {
            Scanner s=new Scanner(System.in);
            int n=s.nextInt();
            for(int i=0;i<n;i++)
            {
                int c=1;
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
