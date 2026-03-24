public class lc151 {
    public String reverseWords(String s) {
        String[] w=s.trim().split("\\s+");
        int l=0;
        int h=w.length-1;
        while(l<h)
        {
            String t=w[l];
            w[l]=w[h];
            w[h]=t;
            l++;
            h--;
        }
        String str=String.join(" ",w);
        return str;
    }
}
