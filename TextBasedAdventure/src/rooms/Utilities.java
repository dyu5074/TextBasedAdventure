package rooms;
// made by Derek Yu
import java.util.Scanner;
import rooms.Person;

public class Utilities {
	public static Person createPerson() {
		System.out.println("Hey, What is your name?");
		Scanner in = new Scanner(System.in);
		String name = in.nextLine();
		 
		return new Person (name,30,10,10,20,false,0,0);
	}
}
