package Task_3;

public abstract class Piece {
	public int x1;
	public int y1;
	
	public char symbol;
	public abstract boolean isLegalMove(int x2, int y2);
}