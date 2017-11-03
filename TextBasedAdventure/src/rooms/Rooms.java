package rooms;
//made by Derek Yu
import java.util.Arrays;

import rooms.Person;

public class Rooms {
	private boolean[] doors;
	 private Person[] occupants;
    private int health = 1000;
    private int damage;
    private boolean explored;
    private int UP = 0;
    private int DOWN = 1;
    private int RIGHT = 2;
    private int LEFT = 3;
    private int money = 100;
	public int gethealth()
	{
		return health;
	}
	public int goUP()
	{
		return UP;
	}
	public int goDOWN()
	{
		return DOWN;
	}
	public int goRIGHT()
	{
		return RIGHT;
	}
	public int goLEFT()
	{
		return LEFT;
	}
	public int getMoney()
	{
		return money;
	}
	public int getdamage()
	{
		return damage;
	}
	public Rooms (boolean[] doors, boolean explored, int health, int damage)
    {
    	this.health = health;
    	this.damage = damage;
        this.doors = doors;
        this.explored = false;
    }
	public boolean explored()
	{
		return explored;
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
	public abstract void print();
	public void addOccupant(Person p)
	{
	     this.occupants = Arrays.copyOf(this.occupants,this.occupants.length+1);
	     this.occupants[this.occupants.length-1] = p;
	}
}
