import java.util.*;
public class swapingofdigit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int n=num;
        int di=(int)Math.log10(num)+1;
        int un=n%10;
        if(di%2!=0)
        {
            n/=10;
        }
        int rev,ans=0,pv=1;
        while(n!=0)
        {
            int rem=n%100;
            rev=(rem%10)*10+(rem/10);
            ans=(rev*pv)+ans;
            pv*=100;
            n/=100;
        }
        if(di%2!=0)
        {
            ans=(ans*10)+un;
        }
        System.out.print(ans);

    }
}