package Task_3;

public class Pawn extends Piece{

	public Pawn(int x1, int y1)
	{
		this.x1 = x1;
		this.y1 = y1;
		this.symbol = 'P';
	}
	
	public boolean isLegalMove(int x2, int y2)
	{
		return x2 - x1 == 1;
	}
}
