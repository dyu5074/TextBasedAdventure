package board;
import rooms.Person;
import rooms.Room;
// made by Derek Yu

public class Board {

private Room[][]map;
	
	public Board(Room[][] map) {
		this.map = map;
	}

	public void printMap(Person player1) {
		for (int i = 0; i < 7; i++)
		{
			for (int j = 0; j < 7; j++)
			{
				if (j == player1.getX() && i == player1.getY())
				{
					System.out.print(" [ " + "i" + " ] ");
				}
				else
					System.out.print(" [   ] ");
			}
			System.out.println(" ");
		} 
	}
	public Room[][] getMap() {
	       return map;
	}
}