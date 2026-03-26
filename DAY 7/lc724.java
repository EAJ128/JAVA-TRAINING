public class lc724 {
    public int pivotIndex(int[] nums) {
        int n=nums.length;
        int sum=0;
        for(int i:nums)
        {
            sum+=i;
        }
        int left=0;
        int right=0;
        for(int i=0;i<n;i++)
        {
            int cur=nums[i];
            if(sum-cur-left==left)
            {
                return i;
            }
            left+=nums[i];
        }
        return -1;
    }
}
