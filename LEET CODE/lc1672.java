class lc1672 {
    public int maximumWealth(int[][] accounts) {
        int n=accounts.length;
        int s=0,max=0;
        int m=accounts[0].length;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                s+=accounts[i][j];
            }
            if(s>max)
            {
                max=s;
            }
            s=0;
        }
        return max;
    }
}