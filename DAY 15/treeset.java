import java.util.*;

public class treeset {
    public static void main(String[] args)
    {
        TreeSet<Integer> tree=new TreeSet<>();
        int[] arr={10,16,20,25,30,35,40,45,50};
        int target=20;
        for(int i:arr)
        {
            tree.add(i);
        }
        int lower=tree.lower(target);
        int higher=tree.higher(target);
        int cdiff=target-tree.lower(target);
        int udiff=tree.higher(target)-target;
        if(lower==-1)
        {
            System.out.println(tree.higher(target));
            
        }
        else if(higher==-1)
        {
            System.out.println(tree.lower(target));
            
        }
        else if(cdiff<=udiff)
        {
            System.out.println(tree.lower(target));
        }
        else
        {
            System.out.println(tree.higher(target));
        }
    }
}
