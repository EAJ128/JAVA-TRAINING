import java.util.*;

class linkedhashset
{
    public static void main(String[] args) {
        Set<Integer> set=new LinkedHashSet<>();
        int[] arr={4,6,3,8,1,2,4,6,3,8,1,2};
        for(int i:arr)
        {
            set.add(i);
        }
        System.out.println(set);
    }
}