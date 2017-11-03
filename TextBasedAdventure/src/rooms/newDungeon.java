package rooms;

import java.util.Scanner;

import board.Board;
import rooms.Person;
import rooms.Rooms;

public class newDungeon {
	private Room[][] dungeonmap;
	public Dungeon(Rooms[][] map) {
		this.dungeonmap=map;
	}
}
	public static Person createPerson(Room[][] map) {
		System.out.print("Hi there friend, what is your name?");
		Scanner name=new Scanner(System.in);
		String p1name=name.next();
		Person p1=new Person();
		Board current=new Board(map);
		p1.Person(p1name);
		return p1;
}
