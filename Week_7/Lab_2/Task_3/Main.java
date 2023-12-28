package Task_3;

public class Main {

	public static void main(String[] args) {
		Board chessBoard = new Board();
		
		Bishop bishop = new Bishop(5,4);
		
		chessBoard.createPiece(bishop);
		//chessBoard.move(5,4,6,5);
		chessBoard.draw();
		
	
	}

}
