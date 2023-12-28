package Task_3;

public class Rook extends Piece{
	
	public Rook(int x1, int y1)
	{
		this.x1 = x1;
		this.y1 = y1;
	}
	
	public boolean isLegalMove(int x2, int y2)
	{
		return x2 == x1 && y2 == y1;
	}
}
