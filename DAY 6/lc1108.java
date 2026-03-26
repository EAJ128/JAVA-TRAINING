public class lc1108 {
    public String defangIPaddr(String address) {
        char[] ch=address.toCharArray();
        StringBuilder str=new StringBuilder();
        for(int i=0;i<ch.length;i++)
        {
            if(ch[i]=='.')
            {
                str.append("[.]");
            }
            else
            {
                str.append(ch[i]);
            }
        }
        return new String(str);

        

    }
}
