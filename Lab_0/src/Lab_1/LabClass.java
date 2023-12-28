package Lab_1;

public class LabClass {
	// read only
	private int moneyOnKaspiCard = 4500;
	final int cvv = 564;
	
	// static variable
	public static String bankName = "KASPI BANK";
	
	public String userName;
	public int userAge;
	
	// enum
	public Gender  gender = Gender.MALE;
	
	public LabClass(String userName, int userAge)
	{
		
		// using of "this"
		this.userName = userName;
		this.userAge = userAge;
	}
	
	public void showPrivateData()
	{
		System.out.println("Current balance: "+ moneyOnKaspiCard + " ,CVV Code: " + cvv);
	}
	
	// overload 
	public void change(String newName)
	{
		userName = newName;
	}
	
	public void change(int newAge)
	{
		userAge = newAge;
	}
	
	
	// static method
	public static void showBankName()
	{
		System.out.println("Bank name: " + bankName);
	}
	
	public String toString()
	{
		return "Gender: " + gender + ", Name: " + userName + ", Age: " + userAge;
	}
}	
