import java.util.*;
class binary2
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int num=n;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                if((i+j)%2!=0)
                System.out.print("0 ");
                else
                System.out.print("1 ");
            }
            System.out.println();
            
            
        }
        
        
        
    }
}