public class lc709 {
    public String toLowerCase(String s) {
        StringBuilder sb=new StringBuilder();
        for(char ch:s.toCharArray())
        {
            if(ch>='A' && ch<='Z')
            {
                char c=(char)(ch+32);
                sb.append(c);
            }
            else
            {
                sb.append(ch);
            }
        }
        return new String(sb);
    }
}
