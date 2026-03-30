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
    @Override
	void send()
	{
		System.out.println("EMAIL NOTIFICATION HAS BEEN SENT TO "+name+" WITH THE MESSAGE "+msg+"Is SENT TO "+details);
	}
}
class smsnotification extends notification
{
	smsnotification(String name,String msg,String phoneno)
	{
		super(name,msg,phoneno);

	}
	@Override
	void send()
	{
		System.out.println("SMS NOTIFICATION HAS BEEN SENDT TO "+name+" WITH THE MESSAGE "+msg+"IS SENT TO "+details);
	}
}
public class notify
{
	public static void main(String[] args)
	{
		notification n;
		n=new emailnotification("DAVID","YOU WAS SELECTED","david@example.com");
		n.send();
		n=new smsnotification("DAVID","YOU WAS SELECTED","9876543210");
		n.send();
	}
}

