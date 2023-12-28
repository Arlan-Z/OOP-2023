package Task_5;

public class Time implements Comparable<Time>{
	int hour;
	int minutes;
	int seconds;
	public Time(int hour, int minutes, int seconds)
	{
		this.hour = hour;
		this.minutes = minutes;
		this.seconds = seconds;
		
		updateTime();
	}
	
	private void updateTime()
	{
		minutes += seconds / 60;
		seconds %= 60;
		
		hour += minutes / 60;
		minutes %= 60;
		
		hour %= 24;
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

	@Override
	public int compareTo(Time o) {
		int totalSeconds = hour * 3600 + minutes * 60 + seconds;
		return totalSeconds - o.hour * 3600 - o.minutes * 60 - seconds;
	}
	
	public String toString()
	{
		return hour + ":" + minutes + ":" + seconds;
	}

}
