package game;
//made by Derek Yu
import rooms.Room;
import rooms.Utilities;
import rooms.Person;

import java.util.Scanner;

import board.Board;
public class GameRunner 
{
	public static void main (String[] args)
	{
		Room[][] map = new Room[7][7];

        Board Dungeon = new Board(map);



        boolean gameOn = true;
        Person player1 = Utilities.createPerson();
        Scanner in = new Scanner(System.in);
        System.out.println("Welcome to the Dungeon Dragon Adventure Game " + player1.getName());
        while(gameOn)
        {
          Dungeon.printMap(player1);
          player1.getMove();  
          System.out.println(player1.getName() + " Your stats are Health:" + player1.health + " Attack:" + player1.attack + " Defense:" + player1.defense + " Ability Power:" + player1.abilitypower);
          
          if(player1.health < 1)
          {
        	  System.out.println("You have died from your injuries. Game Over");
        	  gameOn = false;
          }
          if(player1.getY() > 7)
		  {
            System.out.print("Sorry, " + player1.getName() + " You cannot move this way.\n");
            player1.y -=1;
			
		  }
          if(player1.getY() < 0)
          {
        	System.out.print("Sorry, " + player1.getName() + " You cannot move this way.\n");
        	player1.y +=1;
          }
          if( player1.getX() > 7)
          {
        	System.out.print("Sorry, " + player1.getName() + " You cannot move this way.\n");
        	player1.x -=1;
          }
          if(player1.getX() < 0)
          {
        	System.out.print("Sorry, " + player1.getName() + " You cannot move this way.\n");
        	player1.x +=1;
          }  
          if(player1.getX() == 6 && player1.getY() == 6)
          {
        	System.out.print("Congrats, you won the game!");
        	gameOn = false;
          }
        }
	}
}
