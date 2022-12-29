package manasaCareerTuner;

class SavingAccounts extends Account {
	final double minimumbalance = 500;

	public SavingAccounts(long accountNumber, double balance, String accountHolder) {
		super(accountNumber, balance, accountHolder);
		// TODO Auto-generated constructor stub
	}

	// TODO Auto-generated constructor stub
	public void withdraw(double y)
	{
		if( balance-y>=minimumbalance) 
		{   
			balance=balance-y;
			System.out.println("Amount Withdrawn...");		
     	}
		else
		{
			System.out.println("Insufficient Funds :");
		}
    }
}
class CurrentAccount extends Account
{
    public double overDraftLimit=-1000;
	public CurrentAccount(long accountNumber, double balance, String accountHolder) {
		super(accountNumber, balance, accountHolder);
		// TODO Auto-generated constructor stub
	}
	public void withdraw(double y)
	{
		if(balance-y>-1000)
		{
			balance=balance-y;
			System.out.println("Amount Withdrawn...");		
     	}
		else
		{
			System.out.println("Insufficient Funds :");
		}
	}
}
class SavingAccount
{
	public static void main(String[] args) {
		SavingAccounts SA=new SavingAccounts(1234,2000,"smith");
		SavingAccounts SA1=new SavingAccounts(4321,3000,"kathy");
		SA.deposit(2000);
		SA1.withdraw(2000);
		System.out.println(SA. getBalance());
		System.out.println(SA1. getBalance());
	}
}