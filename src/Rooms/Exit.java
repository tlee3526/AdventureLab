package Rooms;

import Game.Building;
import People.Person;

public class Exit extends Wilderness
{

	public Exit(int x, int y)
	{
		super(x, y);
	}

	/**
	 * Triggers the game ending conditions.
	 * @param x the Person entering
	 */
	@Override
	public void enterRoom(Person x)
	{
		occupant = x;
		x.setxLoc(this.xLoc);
		x.setyLoc(this.yLoc);
		System.out.println("You found the exit!");
		Building.gameOff();
	}
	

}
