public class lc390 {
    public int lastRemaining(int n) {
        boolean left=true;
        int head=1;
        int remain=n;
        int diff=1;
        while(remain>1)
        {
            if(left||remain%2!=0)
            {
                head=head+diff;
            }
            diff*=2;
            remain/=2;
            left=!left;
        }
        return head;
    }
}
