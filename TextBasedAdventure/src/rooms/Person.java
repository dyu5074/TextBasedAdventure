package rooms;
//made by Derek Yu
import java.util.Scanner;
public class Person {
	
	public int health;
	public int attack;
	public int defense;
	private boolean canwin;
	public int x;
	public int y;
	private String name; 
	public int abilitypower;
	
	 public Person ( String name,int health, int attack, int defense, int abilitypower, boolean canwin, int x, int y)
	 {
		 this.name = name;
		 this.attack = attack;
		 this.defense = defense;
		 this.abilitypower = abilitypower;
		 this.canwin = false;
		 this.health = health;
		 this.x = x;
		 this.y = y;
	 }
	 
	 public boolean CanPersonWin()
	 {
		 return canwin;
	 }
	 
	 public String getName()
	 {
		 return name;
	 }
	 
	 public void getMove()
	{
		System.out.println("Use w - up, d - right, s-down, a - left to move around the board.");
		Scanner in = new Scanner(System.in);
		String response = in.nextLine();
		
		if (response.equals("w"))
		{
			this.y -= 1;
		}
		else if (response.equals("s"))
		{
			this.y += 1;
		}
		else if (response.equals("d"))
		{
			this.x += 1;
		}
		else if (response.equals("a"))	
		{
			this.x -= 1 ;
		}
		else
		{
			System.out.println("Invalid Move. Please consider another move.");
		}
	}
	 
	 public int getX()
	 {
		return x;
	 }
		
	 public int getY()
	 {
		return y;
	 }
}
