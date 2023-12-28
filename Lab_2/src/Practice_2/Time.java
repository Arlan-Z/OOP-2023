package Practice_2;

public class Time {
	int hour;
	int minutes;
	int seconds;
	public Time(int hour, int minutes, int seconds)
	{
		this.hour = hour;
		this.minutes = minutes;
		this.seconds = seconds;
	}
	
	public String toUniversal()
	{
		return hour + ":" + minutes + ":" + seconds;
	}
	
	
	public String toStandard()
	{
		int toStandardHhour = hour;
		String AmPm = "AM";
		if (toStandardHhour > 12) 
			{
			toStandardHhour -= 12;
			AmPm = "PM";
			}
			
		return toStandardHhour + ":" + minutes + ":" + seconds + " " + AmPm ;
	}

}
