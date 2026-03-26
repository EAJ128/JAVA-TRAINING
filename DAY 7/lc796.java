public class lc796 {
    public boolean rotateString(String s, String goal) {
        int n=goal.length();
        if(s.length()!=n)
        {
            return false;
        }
        for(int i=0;i<n;i++)
        {
            int index=0;
            while(index<n)
            {
                if(s.charAt((i+index)%n)!=goal.charAt(index))
                {
                    break;
                }
                index++;
            }
            if(index==n)return true;
        }
        return false;
    }
}
