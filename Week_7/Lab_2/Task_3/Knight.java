package Task_3;

public class Knight extends Piece{
	public Knight(int x1, int y1)
	{
		this.x1 = x1;
		this.y1 = y1;
		
		this.symbol = 'H';
	}
	
	public boolean isLegalMove(int x2, int y2)
	{
		return (Math.abs(y2 - y1) == 1 && Math.abs(x2 - x1) == 2) || (Math.abs(y2 - y1) == 2 && Math.abs(x2 - x1) == 1);
	}
	
}
