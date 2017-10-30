package rooms;

import java.util.Arrays;

public abstract class Rooms {
	private boolean[] doors;
    private String occupants;
    private int money;
    private int health;
    private int damage;
    private boolean explored;
	public int getmoney()
    {
    	return 100;
    }
	public int health()
	{
		return health;
	}
	public abstract void print();
	public Room (boolean[] doors,boolean[] explored, private Person[] occupants, int health, int money, int damage)
    {
    	this.money = money;
    	this.occupants = occupants;
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
