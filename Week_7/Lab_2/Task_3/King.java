package Task_3;

public class King extends Piece {
	
	public King(int x1, int y1)
	{
		this.x1 = x1;
		this.y1 = y1;
		this.symbol = 'K';
	}
	
	public boolean isLegalMove(int x2, int y2)
	{
		double Sum = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
		return Sum <= 1;
	}
}
