package rooms;
//made by Derek Yu
import rooms.Rooms;
import java.util.Scanner;
public  class Person {
	private String name;
	private int[] theroom;
	public Person (String thename)
	{
		this.name = thename;
		this.theroom=new int[] {0,0};
	}
	public String getName() {
		return name;
	}
	public void Move() {
		System.out.println("Would you like to move left, right, down or up?");
		Scanner moveinput=new Scanner(System.in);
		String move = moveinput.next();
		if(move.equals("left")) 
		{
			theroom[0]+=-1;
			System.out.println("you moved left");
		}
		if(move.equals("right")) {
			theroom[0]+=+1;
			System.out.println("you moved right");
		}
		if(move.equals("down")) {
			theroom[1]+=-1;
			System.out.println("you moved down");
		}
		if(move.equals("up")) {
			theroom[1]+=+1;
			System.out.println("you moved up");
		}
		System.out.print(theroom[0]+" y= "+theroom[1]);
		System.out.println();
		printmap(theroom[0],theroom[1]);
	}
	public void printmap(int x, int y) {
		for(int i=0; i<10;i++)
		{
			if(i==x)
			{
				for(int j=0;j<9;j++)
				{
					if(j==y)
					{
						System.out.print("1");
					}
					System.out.print("0");
				}
			}
			else
				for(int j=0;j<10;j++)
				{
					System.out.print("0 ");
				}
		System.out.println();
		}
	}
}
