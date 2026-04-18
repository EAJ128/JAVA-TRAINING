interface Math
{
    int add(int a,int b);
}
public class LambdaExample
{
    public static void main(String[] args) {
        Math obj=(a,b)->a+b;
       /*Math obj=new Math()
        {
            @Override
            public int add(int a,int b)
            {
                return a+b;
            }
        };
         */ 
        System.out.println(obj.add(10,20));
    }
}