import java.util.*;

public class subarray {
	public static void main(String[] args)
	{
		int maxi=0,maxj=0,max=0;
		Scanner s=new Scanner(System.in);

		int n=s.nextInt();
		int[] nums=new int[n];
		for(int i=0;i<n;i++)
		{
			nums[i]=s.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			for(int j=i;j<n;j++)
			{
				int sum=0;
				for(int t=i;t<=j;t++)
				{
					if(nums[t]==1)sum+=1;
					else sum-=1;
				}
				if(sum==1 && max<j-i+1)
				{
					max=j-i+1;
					maxi=i;
					maxj=j;
				}
			}
		}
		int[] arr=new int[max];
		int ind=0;
		for(int i=maxi;i<=maxj;i++)
		{
			arr[ind++]=nums[i];
		}
		System.out.println(Arrays.toString(arr));
	}
}
