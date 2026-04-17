class Bank
{
    int balance=1000;
    synchronized void withdraw(int amount)
    {
        if(balance>=amount)
        {
            System.out.println("Withdrawal successful");
            balance-=amount;
        }
        else
        {
            System.out.println("Insufficient balance");
        }
    }
}
class BankThread extends Thread
{
    Bank bank;
    BankThread(Bank bank)
    {
        this.bank=bank;
    }
    public void run()
    {
        bank.withdraw(500);
    }
}


public class Synchronization {
    public static void main(String[] args)
    {
        Bank bank=new Bank();
        BankThread t1=new BankThread(bank);
        BankThread t2=new BankThread(bank);
        t1.start();
        t2.start();
    }   
}
