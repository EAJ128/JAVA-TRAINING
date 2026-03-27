import java.util.*;

public class nonrepeating {
	public static void main(String[] args)
	{
        Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		System.out.print(non(str));
		
	}
	public static char non(String str)
	{
		int[] freq=new int[26];
		for(int i=0;i<str.length();i++)
		{
			freq[(str.charAt(i))-'a']++;
		}
		for(int i=0;i<str.length();i++)
		{
			if(freq[str.charAt(i)-'a']==1)
			{
				return str.charAt(i);
			}
		}
		return ' ';
	}
}
