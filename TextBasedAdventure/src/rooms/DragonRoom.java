package rooms;

import rooms.Person;
import rooms.Room;

public abstract class DragonRoom extends Room{

		public DragonRoom( int x, int y) 
		{
			super( x, y);
		}

		public void increaseAttack(Person player1)
		{
			player1.attack += 5;
		}
		public void increaseHealth(Person player1)
		{
			player1.health += 5;
		}
		public abstract void print();
}
