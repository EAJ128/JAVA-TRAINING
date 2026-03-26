public class lc1470 {
    public int[] shuffle(int[] nums, int n) {
        int l=nums.length;
        int[] arr=new int[l];
        int i=0,k=0,j=n;
        while(j<l)
        {
            arr[k]=nums[i++];
            k++;
            arr[k]=nums[j++];
            k++;
        }
        return arr;
    }
}

