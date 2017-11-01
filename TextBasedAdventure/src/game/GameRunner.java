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
		 System.out.println("Hello " + b + ", Welcome to my dungeon dragon adventure game. What would you like to buy, an axe or a sword?" );
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
	                row[i] = new Dungeon(doors, true, i, j);
	            }

	        }
	}
	private int findKeyword(String statement, String goal, int startPos)
	{
		String phrase = statement.trim().toLowerCase();
		goal = goal.toLowerCase();

		int psn = phrase.indexOf(goal, startPos);

		while (psn >= 0)
		{
			String before = " ", after = " ";
			if (psn > 0)
			{
				before = phrase.substring(psn - 1, psn);
			}
			if (psn + goal.length() < phrase.length())
			{
				after = phrase.substring(
						psn + goal.length(),
						psn + goal.length() + 1);
			}

			if (((before.compareTo("a") < 0) || (before
					.compareTo("z") > 0)) 
					&& ((after.compareTo("a") < 0) || (after
							.compareTo("z") > 0)))
			{
				return psn;
			}

			psn = phrase.indexOf(goal, psn + 1);

		}

		return -1;
	}
}
