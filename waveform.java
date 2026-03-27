import java.util.Scanner;

class waveform
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        
        StringBuilder sb=new StringBuilder();

        String str=s.next();
        int n=str.length();
        for(int i=0;i<n;i+=2)
        {
            sb.append(str.charAt(i));
        }
        for(int i=1;i<n;i+=2)
        {
            sb.append(str.charAt(i));
        }
        System.out.print(new String(sb));
    }
}