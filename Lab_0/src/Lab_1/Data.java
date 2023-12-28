package Lab_1;

public class Data {
	private double averageNumber = 0;
	private double sumNumbers = 0;
	private int numberCount = 0;
	
	
	public void Scanner(String input)
	{
		if(input.charAt(0) == 'Q') return;
		float number = Float.parseFloat(input);
		sumNumbers += number;
		numberCount ++;
		averageNumber = sumNumbers / numberCount;
		

	}
	public String toString()
	{
		return "Average: " + averageNumber + " Sum: " + sumNumbers;
	}
}
