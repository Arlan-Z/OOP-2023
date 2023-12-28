package Lab_1;

public class Temperature {
	private int temperature = 0;
	private char scale = 'C';
	
	public Temperature(int temperature, char scale)
	{
		this.temperature = temperature;
		this.scale = scale;
		
	}
	public Temperature(int temperature)
	{
		this.temperature = temperature;
		this.scale = 'C';
		
	}
	
	public Temperature(char scale)
	{
		this.temperature = 0;
		this.scale = scale;
		
	}
	
	public Temperature()
	{
		this.temperature = 0;
		this.scale = 'C';
		
	}
	
	private void convertToFarenheit()
	{
		if(scale == 'F') return;
		
		temperature = 9 * (temperature / 5) + 32;
		scale = 'F';
	}
	
	private void convertToCelcium()
	{
		if(scale == 'C') return;
		
		temperature = 5 * (temperature - 32) / 32;
		scale = 'C';
	}
	public void showInCelcium()
	{
		convertToCelcium();
		System.out.println(temperature + " " + scale);
	}
	public void showInFarenheit()
	{
		convertToFarenheit();
		System.out.println(temperature + " " + scale);
	}
}

