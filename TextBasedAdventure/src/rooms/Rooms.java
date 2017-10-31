package rooms;

import java.util.Arrays;

public abstract class Rooms {
	private boolean[] doors;
    private String occupants;
    private int health;
    private int damage;
    private boolean explored;
	public int gethealth()
	{
		return health;
	}
	public int getdamage()
	{
		return damage;
	}
	public abstract void print();
	public Rooms (boolean[] doors, boolean explored, int health, int damage)
    {
    	this.health = health;
    	this.damage = damage;
        this.doors = doors;
        this.explored = false;
    }
	public boolean[] getDoors()
    {
    	return doors;
    }
	public  Person[] getOccupants() {
        return occupants;
    }
	public void setOccupants(Person[] occupants) {
        this.occupants = occupants;
    }
	public void addOccupant(Person p)
	{
	     this.occupants = Arrays.copyOf(this.occupants,this.occupants.length+1);
	     this.occupants[this.occupants.length-1] = p;
	     p.setRoom(this);
	}
}
