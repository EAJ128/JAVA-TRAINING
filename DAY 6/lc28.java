public class lc28 {
    public int strStr(String haystack, String needle) {
        int l1=haystack.length();
        int l2=needle.length();
        for(int i=0, j=l2;j<=l1;i++,j++)
        {
            if((haystack.substring(i,j)).equals(needle))
            {
                return i;
            }
        }
        return -1;
    }
}

