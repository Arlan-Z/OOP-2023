package Practice_2;

public class Set_Triangle {
	
	int count;
	private String endLine = "\n";
	String answer;
	
	public Set_Triangle(int count)
	{
		this.count = count;
		answer = makeTriangles();
	}
	
	
	private String makeTriangles()
	{
		String answer = "";
		for(int i = 0; i < count; i ++)
		{
			for(int j = 0; j <= i; j++)
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
