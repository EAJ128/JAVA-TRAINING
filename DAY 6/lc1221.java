public class lc1221 {
    public int balancedStringSplit(String s) {
        int sum=0;
        int c=0;
        for(char ch:s.toCharArray())
        {
            if(ch=='R')
            {
                sum+=1;
            }
            if(ch=='L')
            {
                sum-=1;
            }
            if(sum==0)
            {
                c++;
            }
        }
        return c;
    }
}

