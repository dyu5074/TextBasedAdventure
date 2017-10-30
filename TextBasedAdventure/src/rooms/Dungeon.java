package rooms;
import rooms.Rooms;
public class Dungeon extends Rooms{
	 public Dungeon(boolean[] doors, Person[] occupants, Item[] items, int money, int health, int damage)
	    {
	        super(doors, people, items, health, money, damage);
	    }
	 public void print()
	    {
	        if (getOccupants().length != 0)
	        {
	            System.out.print(getOccupants()[0].print());
	        }
	        else if (this.explored)
	        {
	            System.out.print("[ H ]");
	        }
	        else
	        {
	            System.out.print("[   ]");
	        }

	    }
}
