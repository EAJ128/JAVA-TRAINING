public class lc11 {
    public int maxArea(int[] height) {
        int r=height.length-1;
        int l=0;
        int max=0;
        while(l<r)
        {
            int w=r-l;
            int h=Math.min(height[l],height[r]);
            int area=w*h;
            max=Math.max(max,area);
            if(height[l]<height[r])
            {
                l++;
            }
            else
            {
                r--;
            }
        }
        return max;
    }
}
