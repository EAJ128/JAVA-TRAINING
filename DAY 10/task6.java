/*

Design Locker System where user can store items securely
Each locker protect its internal data and only controlled operation

REQUIREMENTS:

1.Each locker has locker ID isLocked (boolean) pin stored item
2.Operation store item(item,pin) retrieve item(pin) lock() unlock(pin)
3.Rules:
  Items cannot access directly
  Locker opens only with correct pin
  Invalid access should be blocked

 */

import java.util.*;

class Locker
{
    public int lockerid;
	private String item;
	public int pin;
	private boolean status;
	
	Locker(int pin,int lockerid)
	{
		this.lockerid=lockerid;
		this.pin=pin;
		this.status=true;
	}
	
	public void storeItem(String item,int pin)
	{
		if(this.pin==pin)
		{
			if(!status)
			{
				this.item=item;
				System.out.println("Stored Successfully");
			}
			else
			{
				System.out.println("Locker is Locked");
			}
		}
		else
		{
			System.out.println("Invalid Password");
		}
	}
	
	public void retrieve(int pin)
	{
		if(this.pin==pin)
		{
			if(!status && item!=null)
			{
				System.out.println("Retrieve Item "+item);
				item=null;
			}
			else if(item==null)
			{
				System.out.println("Locker Is Empty");
			}
			else
			{
				System.out.println("Locker Is Locked");
			}
		}
		else
		{
			System.out.println("Pin Is Wrong");
		}
	}
		
	public void lock()
	{
		status=true;
		System.out.println("Locker Is Locked");
	}
	
	public void unlock(int pin)
	{
		if(this.pin==pin)
		{
			status=false;
			System.out.println("Locker Is Unlocked");
		}
		else
		{
			System.out.println("Wrong Pin");
		}
	}
}


public class task6 {
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Item");
		String item=s.nextLine();
		System.out.println("Enter Pin");
		int pin=s.nextInt();
		System.out.println("Enter Locker ID");
		int lockerid=s.nextInt();
		Locker l=new Locker(pin,lockerid);
		l.unlock(pin);
		l.storeItem(item,pin);
		l.retrieve(pin);
		l.lock();
		Locker l1=new Locker(pin,lockerid);
		l1.unlock(pin);
		l1.retrieve(pin);
		l1.lock();
	}
}