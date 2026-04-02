public class Wrapper {
	public static void main(String[] args)
	{
		Integer i= Integer.valueOf("1234567");//return type->object(Integer)
		int j=Integer.parseInt("09876");//return type integer (primitive)
		Integer x=128;
		x=130;
		Integer y=130;
		System.out.println(x.equals(y)?true:false);
		System.out.println(x);
		System.out.println(i);
		System.out.println(j);
	}
}
