public class lc1512 {
    public int numIdenticalPairs(int[] nums) {
        int[] h=new int[111];
        int c=0;
        for(int i:nums)
        {
            c+=h[i];
            h[i]++;
        }
        return c;
    }
}
