import java.util.Scanner;

public class trailingzero {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        long fac=1,c=0;
        for(long i=1;i<=n;i++)
        {
            fac=fac*i;
        }
        System.out.println(fac);
        while(fac!=0)
        {
            int d=(int) (fac%10);
            if(d==0)
            {
                c++;
            }
            else
            {
                break;
            }
            fac/=10;
        }
        System.out.println(c);
    }
}
