package Game;

import People.Person;
import Rooms.Exit;
import Rooms.Wilderness;

import java.util.Scanner;

public class Building
{
    private static boolean gameOn = true;

    public static void main(String[] args)
    {
        Wilderness[][] building = new Wilderness[10][10];

        //Fill the building with normal rooms
        for (int x = 0; x<building.length; x++)
        {
            for (int y = 0; y < building[x].length; y++)
            {
                building[x][y] = new Wilderness(x,y);
            }
        }
        //create a house
        for (int a = 0; a < 2; a++)
        {
            int c = (int) (Math.random() * building.length);
            int d = (int) (Math.random() * building.length);
            building[c][d] = new House(c, d);

            for (int b = 0; b < 2; b++)
            {
                int e = (int) (Math.random() * building.length);
                int f = (int) (Math.random() * building.length);
                building[e][f] = new Chest(e, f);
            }
            //Create a random winning room.
            int x = (int) (Math.random() * building.length);
            int y = (int) (Math.random() * building.length);
            building[x][y] = new Exit(x, y);
        }
        //Setup player 1 and the input scanner
        Person player1 = new Person("FirstName", "FamilyName", 0,0);
        building[0][0].enterRoom(player1);
        Scanner in = new Scanner(System.in);
        while(gameOn)
        {
            System.out.println("Where would you like to move? (Choose W, A, S, D)");
            String move = in.nextLine();
            if(validMove(move, player1, building))
            {
                System.out.println("Your coordinates: row = " + player1.getxLoc() + " col = " + player1.getyLoc());

            }
            else {
                System.out.println("You cannot move off the board.");
            }


        }
        in.close();
    }

}
