import java.util.*;

public class freq {
    public static void main(String[] args)
    {
        int[] arr={10,16,20,25,30,35,40,45,50};
        Map<Integer,Integer> map=new HashMap<>();
        for(int i:arr)
        {
            if(map.containsKey(i))
            {
                map.put(i,map.get(i)+1);
            }
            else
            {
                map.put(i,1);
            }
        } 
    }
}