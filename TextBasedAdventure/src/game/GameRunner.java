package game;

import java.util.Scanner;
import rooms.Rooms;
import rooms.Dungeon;
public class GameRunner 
{
	public static void main (String[] args)
	{
		 Scanner a = new Scanner(System.in);
		 System.out.println("Hello, what is your name?");
		 String b = a.nextLine();
		 System.out.println("Hello " + b + "Welcome to my dungeon dragon adventure game. What would you like to buy, an axe or a sword?" );
		 Scanner c = new Scanner(System.in);
		 String d = c.nextLine();
		 if (c.nextLine() == "axe")
		 {
			 System.out.println("Nice, you have acquired an axe, use it to kill dragons");
		 }
		 else
		 {
			 System.out.println("Nice, you have acquired a sword, use it to kill dragons");
		 }
		 
		 Rooms[][] map = new Rooms[5][5];
	        for (int j = 0; j<map.length; j++)
	        {
	        	Rooms[] row = map[j];
	            for (int i = 0; i<row.length;i++)
	            {
	                boolean[] doors = {true,true,true,true};
	                row[i] = new Dungeon(doors, i, j);
	            }

	        }
	}
}
