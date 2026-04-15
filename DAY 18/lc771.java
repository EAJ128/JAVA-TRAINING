import java.util.ArrayList;
import java.util.List;

public class lc771 {
    public int numJewelsInStones(String jewels, String stones) {
        List<Character> list=new ArrayList<>();
        int count=0;
        for(char c:jewels.toCharArray())
        {
            list.add(c);
        }
        for(char c:stones.toCharArray())
        {
            if(list.contains(c))
            {
                count++;
            }
        }
        return count;
    }
}
