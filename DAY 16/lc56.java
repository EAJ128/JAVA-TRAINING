import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class lc56 {
    public int[][] merge(int[][] intervals) {
        Comparator<int[]> byZerothIndex=new Comparator<int[]>(){
            public int compare(int[] a,int[] b){
                return Integer.compare(a[0],b[0]);
            }
        };
        Arrays.sort(intervals,byZerothIndex);
        List<int[]> result=new ArrayList<>();
        for(int[] current:intervals)
        {
            if(result.isEmpty()||result.get(result.size()-1)[1]<current[0])
            {
                result.add(current);
            }
            else
            {
                int[] merge=result.get(result.size()-1);
                merge[1]=Math.max(merge[1],current[1]);
            }
        }
        return result.toArray(new int[result.size()][]);
    }
}

