import java.util.*;

public class MapExample {
    public static void main(String[] args)
    {
        int[] arr={10,16,20,25,30,35,40,45,50};
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            map.put(i,arr[i]);
        }
        for(Map.Entry<Integer,Integer> entry:map.entrySet())
        {
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
        System.out.println(map.keySet());
    }
}
