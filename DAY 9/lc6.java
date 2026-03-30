import java.util.*;

public class lc6
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int numRows=sc.nextInt();
        System.out.println(new lc6().convert(s,numRows));
    }
    public String convert(String s, int nr) {
         StringBuilder [] rows = new StringBuilder[nr];
        for(int i =0;i<nr;i++){
            rows[i] = new StringBuilder();

        }
        boolean gu = false;
        int curr = 0;
        for(char c:s.toCharArray()){
            rows[curr].append(c);
            
            if(curr == 0 || curr == nr- 1  ){
                gu = !gu;
            }
            if(gu){
                curr+= 1;
            }
            else{
            curr+= -1;}
           
        }
        StringBuilder ans = new StringBuilder();
        for(StringBuilder r:rows){
            ans.append(r);
        }
        return new String(ans);
    }
}