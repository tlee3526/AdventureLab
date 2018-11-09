package Rooms;

import Game.Building;
import Game.Runner;
import People.Person;

public class Wilderness
{
	Person occupant;
	int xLoc,yLoc;
	
	public Wilderness(int x, int y)
	{
		xLoc = x;
		yLoc = y;
	}

	/**
	 * Method controls the results when a person enters
	 * @param x the Person entering
	 */
	public void enterRoom(Person x)
	{
		System.out.println("You walk through the wild.");
		occupant = x;
		x.setxLoc(this.xLoc);
		x.setyLoc(this.yLoc);
		Building.gameOff();
	}

	/**
	 * Removes the player from the spot
	 * @param x
	 */
	public void leaveRoom(Person x)
	{
		occupant = null;
	}
}
