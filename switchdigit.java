import java.util.*;
public class switchdigit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int pos1=sc.nextInt();
        int pos2=sc.nextInt();
        int pv1=(int)Math.pow(10,pos1-1);
        int pv2=(int)Math.pow(10,pos2-1);
        int d1=(num/pv1)%10;
        int d2=(num/pv2)%10;
        num=(num-(d1*pv1)+(d2*pv1)-(d2*pv2)+(d1*pv2));
        System.out.println(num);


    }
}