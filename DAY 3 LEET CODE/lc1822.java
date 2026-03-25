public class lc1822 {
    public int arraySign(int[] nums) {
        int p=1;
        for(int n:nums)
        {
            if(n<0)
            {
                p=-p;
            }
            if(n==0)
            {
                p=0;
            }
           
        }
         return p;
    }
}
