
public class lc1781 {
    public int beautySum(String s) {
        
        int c=0;
        
        for(int i=0;i<s.length();i++)
        {
            int[] freq=new int[26];
            for(int j=i;j<s.length();j++)
            {
                freq[s.charAt(j)-'a']++;
                int max=Integer.MIN_VALUE;int min=Integer.MAX_VALUE;
                for(int k=0;k<26;k++)
                {
                    if(freq[k]>0)
                    {
                        max=Math.max(max,freq[k]);
                    
                        min=Math.min(min,freq[k]);
                    }
                    
                }
                int sum=max-min;
                
                    c+=sum;
                

            }
        }
        return c;
    }
}
