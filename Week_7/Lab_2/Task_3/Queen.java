package Task_3;

public class Queen extends Piece{
	
	public Queen(int x1, int y1)
	{
		this.x1 = x1;
		this.y1 = y1;
		this.symbol = 'Q';
	}
	
	public boolean isLegalMove(int x2, int y2)
	{
		return (x2 == x1 && y2 == y1) || Math.abs(y2 - x2) == Math.abs(y1 - x1);
	}
}
