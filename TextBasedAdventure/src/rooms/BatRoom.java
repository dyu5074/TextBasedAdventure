package rooms;
import java.util.Random;
//made by Derek Yu
public abstract class BatRoom extends Room{

	public int batHealth;
	public int batAttack;
	public int batDefense;
	public int batabilitypower;
	
	public BatRoom(int x, int y) 
	{
		super(x, y);
	}
	
	public int getHealth()
	{
		Random rand = new Random();
		int  n = rand.nextInt(15) + 5;
		return batHealth = n;	
	}
	
	public int getAttack()
	{
		Random rand = new Random();
		int  n = rand.nextInt(6) + 2;
		return batAttack = n;
	}
	
	public int getDefense()
	{
		Random rand = new Random();
		int  n = rand.nextInt(15) + 5;
		return batDefense = n;	
	}
	
	public int getabilitypower()
	{
		Random rand = new Random();
		int  n = rand.nextInt(15) + 5;
		return batabilitypower = n;	
	}
}