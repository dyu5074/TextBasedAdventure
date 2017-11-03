package rooms;

import java.util.Scanner;

import board.Board;
import rooms.Person;
import rooms.Rooms;

public class Utilities {
	public static Person createPerson(Rooms[][] map) {
		System.out.print("Hi there friend, what is your name?");
		Scanner name = new Scanner(System.in);
		String player1=name.next();
		Person player1 = new Person();
		Board current=new Board(map);
		player1.Person(player1);
		return player1;
}
}
