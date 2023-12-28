package Practice_2;

public class TrianglePositioned {
	
	int height;
	String position;
	
	private String answer;
	private String endLine = "\n";
	
	public TrianglePositioned(int height, String position)
	{
		this.height = height;
		this.position = position;
		if(position == "LEFT") answer = toLeft();
		if(position == "RIGHT") answer = toRight();
		if(position == "CENTER") answer = toCenter();
	}
	
	private String toLeft()
	{
		String answer = "";
		for(int i = 0; i < height; i ++)
		{
			for(int j = 0; j <= i; j++)
			{
				answer += "[*] ";
			}
			answer += endLine;
		}
		return answer;
	}
	
	private String toRight()
	{
		String answer = "";
		for(int i = height - 1; i >= 0; i --)
		{
			for(int j = 0; j < i; j++)
			{
				answer += "    ";
			}
			for(int j = i; j < height; j++)
			{
				answer += "[*] ";
			}
			answer += endLine;
		}
		return answer;
	}
	
	private String toCenter()
	{
		String answer = "";
		for(int i = height - 1; i >= 0; i --)
		{
			for(int j = 0; j < i; j++)
			{
				answer += "  ";
			}
			for(int j = i; j < height; j++)
			{
				answer += "[*] ";
			}
			answer += endLine;
		}
		return answer;
	}
	
	public String toString()
	{
		return answer;
	}
	
	
}
