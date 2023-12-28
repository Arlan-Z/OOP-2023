package Task_3;

public class Bishop extends Piece{
	
	public Bishop(int x1, int y1)
	{
		this.x1 = x1;
		this.y1 = y1;
		this.symbol = 'B';
	}
	
	public boolean isLegalMove(int x2, int y2)
	{
		return Math.abs(y2 - x2) == Math.abs(y1 - x1);
	}
}
