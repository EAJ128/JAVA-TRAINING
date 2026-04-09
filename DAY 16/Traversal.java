import java.util.*;


public class Traversal {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        ListIterator<Integer> it=list.listIterator();
        while(it.hasNext())
        {
            int curr=it.next();
            System.out.println(curr+" ");
        }
        while(it.hasPrevious())
        {
            int curr=it.previous();
            System.out.println(curr+" ");
        }
    }
}
