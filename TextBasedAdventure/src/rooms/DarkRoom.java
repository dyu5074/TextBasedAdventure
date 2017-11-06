package rooms;

import rooms.Person;
import rooms.Room;

public abstract class DarkRoom extends Room{

		public DarkRoom( int x, int y) 
		{
			super( x, y);
		}

		public void increaseAbilitypower(Person player1)
		{
			player1.abilitypower += 5;
		}
		public void increaseHealth(Person player1)
		{
			player1.health += 5;
		}
		public abstract void print();
}