public class lc1217 {
    public int minCostToMoveChips(int[] position) {
        int odd=0,even=0;
        for(int i:position)
        {
            if(i%2==0)
            {
                even++;
            }
            else
            {
                odd++;
            }
        }
        return Math.min(even,odd);
    }
}
