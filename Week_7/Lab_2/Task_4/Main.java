package Task_4;
import java.util.Vector;


public class Main {
	static Vector<Account> bank = new Vector<>();
	public static void openAccount(Account Account)
	{
		bank.add(Account);
	}
	public static void closeAccount(Account Account)
	{
		bank.remove(Account);
	}
	
	public static void update()
	{
		for(Account account : bank)
		{
			account.deposit(5000);
			if (account instanceof SavingAccount)
			{
				((SavingAccount) account).addInterest();
			}
			
			if (account instanceof CheckingAccount)
			{
				((CheckingAccount) account).withdraw(2500);
			}
			else account.withdraw(2500);
		}
	}
	
	public static void main(String[] args) {
		
		
		Account Kaspi = new Account(1);
		SavingAccount Halyk = new SavingAccount(2, 16.4);
		CheckingAccount Forte = new CheckingAccount(3, 1.5);
		openAccount(Kaspi);
		openAccount(Halyk);
		openAccount(Forte);
		
		update();
		System.out.println(Kaspi.getBalance());
		System.out.println(Halyk.getBalance());
		System.out.println(Forte.getBalance());
		
	}

}
