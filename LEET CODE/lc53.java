
public class lc53 {
    public int maxSubArray(int[] nums) {
        int s=0,max=nums[0];
        for(int i:nums)
        {
            s+=i;
            if(max<s)
            {
                max=s;

            }
            if(s<0)
            {
                s=0;
            }
        }
        return max;
    }
}
