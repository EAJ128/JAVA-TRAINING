public class lc42 {
    public int trap(int[] height) {
        int l=0,r=height.length-1;
        int leftmax=0;int rightmax=0;
        int waterlevel=0;
        while(l<r)
        {
            if(height[l]<height[r])
            {
                if(height[l]>leftmax)
                {
                    leftmax=height[l];
                }
                else
                {
                    waterlevel+=leftmax-height[l];

                }
                l++;
            }
            else
            {
                if(height[r]>rightmax)
                {
                    rightmax=height[r];
                }
                else
                {
                    waterlevel+=rightmax-height[r];
                }
                r--;
            }
        }
        return waterlevel;       
    }
}





/*

BRUTE FORCE

int l=0,r=height.length-1;
        int waterlevel=0;
        for(int curr=0;curr<=r;curr++)
        {
            int leftmax=0;int rightmax=0;
            for(int i=0;i<=curr;i++)
            {
                if(leftmax<height[i])
                {
                    leftmax=height[i];
                }
            }
            for(int j=curr;j<=r;j++)
            {
                if(rightmax<height[j])
                {
                    rightmax=height[j];
                }
            }
            int min=Math.min(leftmax,rightmax);
            waterlevel+=min-height[curr];
        }
        return waterlevel;


int l=0,r=height.length-1;
        int leftmax=0;int rightmax=0;
        int waterlevel=0;
        while(l<r)
        {
            if(height[l]<height[r])
            {
                if(height[l]>leftmax)
                {
                    leftmax=height[l];
                }
                else
                {
                    waterlevel+=leftmax-height[l];

                }
                l++;
            }
            else
            {
                if(height[r]>rightmax)
                {
                    rightmax=height[r];
                }
                else
                {
                    waterlevel+=rightmax-height[r];
                }
                r--;
            }
        }
        return waterlevel;
    

*/