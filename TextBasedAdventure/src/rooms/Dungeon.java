package rooms;
import rooms.Rooms;
public class Dungeon extends Rooms{
	 public Dungeon(boolean[] doors,boolean explored, int health, int damage)
	    {
	        super(doors, explored, health, damage);
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
	 public String toString()
	    {
	    	boolean[] doors = this.getDoors();
	    	String response = "This room is a Dungeon. It has doors to the ";
	    	if (doors[0])
	    	{
	    		response += "Lavatory";
	    	}
	    	
	    	if(doors[1]) {
	    		response += " and Laboratory";
	    	}
	    	
	    	if (doors[2]) {
	    		response += " and Castle";
	    	}
	    	
	    	if (doors[3]) {
	    		response += " and Fortress";
	    	}
	    	
	    	return response;
	    }
}
