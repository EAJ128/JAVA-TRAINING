import java.util.*;

public class lc217
{
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set=new HashSet<>();
        for(int i:nums)
        {
            if(!set.add(i))
            {
                return true;
            }
        }
        return false;
    }
}