abstract class smartDevice
{
	abstract void turnon();
	abstract void turnoff();
	void deviceInfo()
	{
		System.out.println("YEAH IT IS A DEVICE");
	}
	abstract void setLevel(int level);
}

class Light extends smartDevice
{
	@Override
	void turnon()
	{
		System.out.println("LIGHTS ON");
	}
	@Override
	void turnoff()
	{
		System.out.println("LIGHTS OFF");
	}
	@Override
	void setLevel(int level)
	{
		System.out.println("LEVEL OF IT IS "+level);
	}
	
}

public class smart {
	public static void main(String[] args)
	{
		smartDevice s=new Light();
		s.turnon();
		s.turnoff();
		s.deviceInfo();
		s.setLevel(100);
	}
}
