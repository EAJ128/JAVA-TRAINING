import java.util.*;

public class pattern4 {
    public static void main(String[] args) {
        {
            Scanner s=new Scanner(System.in);
            int n=s.nextInt();
            int num=n;
            for(int i=0;i<n;i++)
            {
                for(int j=1;j<=n-i;j++)
                {
                    System.out.print("* ");
                    
                }
                
                System.out.println();
            }
        }
    }
}




/*


5
* * * * *
* * * *
* * *
* *
*


 */