import java.util.*;

class Bank
{
	private double balance;
	public void setBalance(double balance)//Setters
	{
		if(balance > 0)
			this.balance=balance;
		else
			System.out.println("Invalid Balance");
	}
	public double getBalance()//Getters
	{
		return balance;
	}
	public void credit(double amount)
	{
		if(amount>0)
		{
			this.balance+=amount;
			System.out.println("Amount Credited Successfully "+balance);
		}
		else
		{
			System.out.println("Ivalid Credit Amount");
		}
	}
	public void debit(double amount)
	{
		if(amount<=balance && amount>0)
		{
			this.balance-=amount;
			System.out.println("Amount Debited Successfully "+balance);
		}
		else
		{
			System.out.println("Low Balance");
		}
	}
	
	
}

public class Encapsulation {
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		Bank b=new Bank();
		System.out.println("Enter Bank Balance");
		b.setBalance(s.nextDouble());
		System.out.println("Enter The Amount For Credit");
		b.credit(s.nextDouble());
		System.out.println("Enter The Amount For Debit");
		b.debit(s.nextDouble());
		System.out.println(b.getBalance());
	}
}
