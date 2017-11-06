package rooms;

import java.util.Random;

public abstract class DungeonRoom extends Room{

	public int dragonHealth;
	public int dragonAttack;
	public int dragonDefense;
	public int dragonabilitypower;
	public DungeonRoom(int x, int y) 
	{
		super(x, y);
	}
		
	public int getabilitypower()
	{
		Random rand = new Random();
		int  i = rand.nextInt(20) + 25;
		return dragonabilitypower = i;	
	}
	//gets the ability power
	public int getHealth()
	{
		Random rand = new Random();
		int  i = rand.nextInt(20) + 25;
		return dragonHealth = i;	
	}
	//gets the health 	
	public int getAttack()
	{
		Random rand = new Random();
		int  i = rand.nextInt(17) + 10;
		return dragonAttack = i;
	}
	//gets the attack 
	public int getDefense()
	{
		Random rand = new Random();
		int  i = rand.nextInt(10) + 5;
		return dragonAttack = i;
	}
	//gets the defense 
}