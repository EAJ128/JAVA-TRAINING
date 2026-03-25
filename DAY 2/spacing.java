import java.util.*;
public class spacing
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
        int val = 1;
		int num=s.nextInt();
		
		for(int i=0;i<num;i++)
		{
		    for(int space=0;space<=i;space++)
		    {
		        System.out.print("   ");
		    }
		    for(int col=1;col<=num-i;col++)
		    {
		        System.out.printf("%02d ",val++);
		        
		    }
		    System.out.println();
		}
	}
}

/*
5
   01 02 03 04 05 
      06 07 08 09 
         10 11 12 
            13 14 
               15  
 */