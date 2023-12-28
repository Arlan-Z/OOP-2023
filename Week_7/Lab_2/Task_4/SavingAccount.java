package Task_4;

public class SavingAccount extends Account{
	private double interestRate; 
    public SavingAccount(int a, double interestRate) 
    {
        super(a);
        this.interestRate = interestRate;
    }

    public void addInterest() 
    {
        deposit(getBalance() * interestRate / 100);
    }
}
