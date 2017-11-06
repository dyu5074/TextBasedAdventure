package rooms;
//made by Derek Yu
import rooms.Person;

public abstract class shopRoom extends Room {

	public shopRoom( int x, int y) {
		super( x, y);
	}

	public void increaseDefense(Person player1)
	{
		player1.defense += 5;
	}
	public void increaseHealth(Person player1)
	{
		player1.health += 5;
	}
	public abstract void print();
}