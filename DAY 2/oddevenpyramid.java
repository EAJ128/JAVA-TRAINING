
/* 
input: 5
output:
1 
2 4 
1 3 5 
2 4 6 8 
1 3 5 7 9 

*/










import java.util.*;
class oddevenpyramid
{
    public static void main(String args[])
    {
        int o=1,e=2;
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int num=n;
        for(int i=1;i<=n;i++)
        {
            
            for(int j=1;j<=i;j++)
            {
                if(i%2!=0)
                {
                    System.out.print(o+" ");
                    o+=2;
                }
                else
                {
                    System.out.print(e+" ");
                    e+=2;
                }
            }
            System.out.println();
            o=1;e=2;
            
            
        }
        
        
        
    }
}

