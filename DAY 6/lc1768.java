public class lc1768 {
    public String mergeAlternately(String word1, String word2) {
        int l1=word1.length();
        int l2=word2.length();
        char[] w1=word1.toCharArray();
        char[] w2=word2.toCharArray();
        int min=Math.min(l1,l2);
        StringBuilder sb=new StringBuilder();
        int i=0;
        while(i<min)
        {
            sb.append(w1[i]);
            sb.append(w2[i]);
            i++;
        }
        while(i<l1)
        {
            sb.append(w1[i]);
            i++;
        }
        while(i<l2)
        {
            sb.append(w2[i]);
            i++;
        }
        return new String(sb);
    }
}

