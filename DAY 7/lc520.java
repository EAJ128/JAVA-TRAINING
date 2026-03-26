public class lc520 {
    public boolean detectCapitalUse(String word) {
        int n=word.length();
        if(n==1)return true;
        boolean first=Character.isUpperCase(word.charAt(0));

        boolean second=Character.isUpperCase(word.charAt(1));

        if(!first && second) return false;
        for(int i=2;i<n;i++)
        {
            if(Character.isUpperCase(word.charAt(i)) !=second) 
                return false;
        }
        return true;
    }
}
