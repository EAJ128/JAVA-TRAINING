import java.util.*;


public class wordlength {
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        System.out.println(wordlengths(str));
    }
    public static int wordlengths(String s)
    {
        int n=s.length();
        int c=0;
        for(int i=1;i<n;i++)
        {
            if(((s.charAt(i-1)>='A'&&s.charAt(i-1)<='Z')||(s.charAt(i-1)>='a'&&s.charAt(i-1)<='z')&&s.charAt(i)==' ')||((s.charAt(i)>='A'&&s.charAt(i)<='Z')||(s.charAt(i)>='a'&&s.charAt(i)<='z')&&i==n-1))
            {
                c++;
            }
            
            
        }
        return c;
    }
}
