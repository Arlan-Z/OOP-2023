package Task_4;

public class CheckingAccount extends Account{
	 	private static final int FREE_TRANSACTIONS = 3;
	    private int transactions; 
	    private double fee;       

	    public CheckingAccount(int a, double fee) {
	        super(a);
	        this.fee = fee;
	        transactions = 0;
	    }

	    @Override
	    public void deposit(double sum) {
	        super.deposit(sum);
	        applyFees();
	    }

	    @Override
	    public void withdraw(double sum) {
	        super.withdraw(sum);
	        applyFees();
	    }

	    private void applyFees() {
	        transactions++;
	        if (transactions > FREE_TRANSACTIONS) {
	            withdraw(fee);
	        }
	    }
}
