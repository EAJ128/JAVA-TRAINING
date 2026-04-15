import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class lc819 {
    public String mostCommonWord(String paragraph, String[] banned) {
        paragraph=paragraph.toLowerCase();
        paragraph=paragraph.replaceAll("[^a-z]"," ");
        String[] word=paragraph.split("\\s+");
        Map<String,Integer> map=new HashMap<>();
        Set<String> set=new HashSet<>(Arrays.asList(banned));
        int max=0;
        String res="";
        for(String s:word)
        {
            if(!set.contains(s) && s.length()>0)
            {
                map.put(s,map.getOrDefault(s,0)+1);
                if(max<map.get(s))
                {
                    max=map.get(s);
                    res=s;
                }
            }
        }
        return res;
    }
}
