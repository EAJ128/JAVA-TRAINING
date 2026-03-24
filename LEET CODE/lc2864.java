public class lc2864 {
    public String maximumOddBinaryNumber(String s) {
        int c1=0,c2=0;
        String str="";
        for(char c:s.toCharArray())
        {
            if(c=='1')
            {
                c1++;
            }
            else
            {
                c2++;
            }

        }
        c1--;
        
        while(c1!=0)
        {
            str+='1';
            c1--;
        }
        while(c2!=0)
        {
            str+='0';
            c2--;
        }
        str+='1';
        return str;
    }
}
