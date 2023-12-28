package Task_3;
import java.util.*;

public class Board {
	Map<List<Integer>, Piece> board = new HashMap<>();
	public void draw()
	{
		for(int i = 0; i < 8; i++)
		{
			for(int j = 0; j < 8; j++)
			{
				System.out.print("<|");
				System.out.print(board.containsKey(Arrays.asList(i, j)) ? (board.get(Arrays.asList(i, j))).symbol : " ");
				System.out.print("|>  ");
			}
			System.out.println();
		}
	}
	
	
	public void createPiece(Piece Figure)
	{
		if(board.containsKey(Arrays.asList(Figure.x1, Figure.y1)))
			{
				System.out.println("This cell is busy");
				return;
			}
		board.put(Arrays.asList(Figure.x1, Figure.y1), Figure);
		
	}
	
	public void move(int x1, int y1, int x2, int y2)
	{
		if(x2 >= 8 || y2 >= 8)
		{
			System.out.println("Invalid move: There are no such cell");
			return;
		}
		
		if(!board.containsKey(Arrays.asList(x1,y1)) && board.containsKey(Arrays.asList(x2,y2)))
		{
			System.out.println("Invalid move: This cell is busy");
			return;
		}
		
		if(!(board.get(Arrays.asList(x1, y1)).isLegalMove(x2, y2)))
			{
			System.out.println("Invalid move: Illegal move");
			return;
			}
			board.get(Arrays.asList(x1, y1)).x1 = x2;
			board.get(Arrays.asList(x1, y1)).y1 = y2;
			
			board.put(Arrays.asList(x2, y2),board.get(Arrays.asList(x1, y1)));
			board.remove(Arrays.asList(x1, y1));
		
	}
}
