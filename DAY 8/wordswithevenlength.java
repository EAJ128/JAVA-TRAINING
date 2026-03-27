import java.util.Scanner;

public class wordswithevenlength {
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		System.out.print(wordseven(str));
	}
	public static String wordseven(String str)
	{
		int n=str.length();
		StringBuilder sb=new StringBuilder();
        StringBuilder result=new StringBuilder();
		for(int i=0;i<n;i++)
        {
            if(str.charAt(i)!=' ')
            {
                if(i==n-1)
                {
                    sb.append(str.charAt(i));
                }
                sb.append(str.charAt(i));
            }
            else
            {
                if(sb.length()%2==0)
                {
                    result.append(sb);
                    result.append(" ");
                }
                sb.setLength(0);

            }
        }
		return new String(result);
	}
}




/*

import java.util.Scanner;

public class wordswithevenlength {
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		System.out.print(wordseven(str));
	}
	public static String wordseven(String str)
	{
		int start=0;
		int n=str.length();
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<n;i++)
		{
			if((str.charAt(i)>='a'&&str.charAt(i)<='z') || (str.charAt(i)>='A'&&str.charAt(i)<='Z'))
			{
				if(i==n-1|| str.charAt(i+1)==' ')
				{
					if(((i+1)-start)%2==0)
					{
						sb.append(str.substring(start,i+1));
						sb.append(" ");
						
					}
                    start=i+2;
				}
			}
		}
		return new String(sb);
	}
}



*/