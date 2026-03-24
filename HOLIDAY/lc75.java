public class lc75 {
    public void sortColors(int[] nums) {
        int c0=0,c1=0,c2=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0)
            {
                c0++;
            }
            else if(nums[i]==1)
            {
                c1++;
            }
            else
            {
                c2++;
            }
        }
        int index=0;
        for(int i=0;i<c0;i++)
        {
            nums[index]=0;
            index++;
        }
        for(int i=0;i<c1;i++)
        {
            nums[index]=1;
            index++;
        }
        for(int i=0;i<c2;i++)
        {
            nums[index]=2;
            index++;
        }
    }
}
