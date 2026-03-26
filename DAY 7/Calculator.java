class calc
{
    int add(int a,int b)
    {
        return a+b;
    }
    int add(int a,int b,int c)
    {
        return a+b+c;
    }
    Double add(Double a,Double b)
    {
        return a+b;
    }

}
class Calculator
{
    public static void main(String[] args) {
        calc c=new calc();
        System.out.print(c.add(123,344));
        System.out.print(c.add(23,45,67));
        System.out.print(c.add(23.13,31324.13));
    }
}