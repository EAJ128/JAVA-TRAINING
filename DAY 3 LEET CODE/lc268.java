public class lc268 {
    public int missingNumber(int[] nums) {
        int s=0;
        int n=nums.length;
        int t=(n*(n+1))/2;
        for(int i:nums)
        {
            s+=i;
        }
        return t-s;
    }
}
