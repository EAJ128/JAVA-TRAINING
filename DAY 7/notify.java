class notification 
{
	String name;
	String msg;
	String details;

    notification(String name,String msg,String details)
	{
		this.name=name;
	 	this.msg=msg;
		this.details=details;
	}
	
	void send()
	{
		System.out.println("NOTIFICATION MAIN HAS BEEN RUNNED");
	}
}
class emailnotification extends notification
{
	emailnotification(String name,String msg,String email)
	{
		super(name,msg,email);

	}
	void send()
	{
		System.out.println("***********************************************************");

		System.out.println("EMAIL NOTIFICATION HAS BEEN SENT TO "+name+" WITH THE MESSAGE "+msg+"Is SENT TO "+details);
		System.out.println("***********************************************************");

	}
}
class smsnotification extends notification
{
	smsnotification(String name,String msg,String phoneno)
	{
		super(name,msg,phoneno);

	}
	void send()
	{
		System.out.println("***********************************************************");
		System.out.println("SMS NOTIFICATION HAS BEEN SENT TO "+name+" WITH THE MESSAGE "+msg+"IS SENT TO "+details);
		System.out.println("***********************************************************");

	}
}
public class notify
{
	public static void main(String[] args)
	{
		notification[] n={
			new emailnotification("DAVID","YOU WAS SELECTED","david@example.com"),
			new smsnotification("DAVID","YOU WAS SELECTED","9876543210")
		};
		for(int i=0;i<2;i++)
		{
			n[i].send();
		}
	}
}
