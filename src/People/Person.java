package People;

/**
 * Person represents the player as they move through the game.
 */
public class Person
{
	String firstName;
	String familyName;
	int xLoc, yLoc;
	int health = 100;
	int amour = 20;
	int speed = 1;
	int attack = 5;


	public int getxLoc() {
		return xLoc;
	}

	public void setxLoc(int xLoc) {
		this.xLoc = xLoc;
	}

	public int getyLoc() {
		return yLoc;
	}

	public void setyLoc(int yLoc) {
		this.yLoc = yLoc;
	}

	public Person (String firstName, String familyName, int xLoc, int yLoc)
	{
		this.firstName = firstName;
		this.familyName = familyName;
		this.xLoc = xLoc;
		this.yLoc = yLoc;
	}


}
