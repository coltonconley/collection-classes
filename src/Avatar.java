/*************************************************************
 * Avatar Class
 * 
 * Description: Each avatar holds a set of coordinates, 
 * a strength (int), and a name (String). The class provides a 
 * constructor and a toString() method is provided which displays 
 * the name, strength and the coordinates(x, y, then z)/
 **************************************************************/
public class Avatar extends Item {

	private String name; //Avatar name
	private int strength; //Avatar strength
	
	/**
	 * Constructor
	 */
	public Avatar(int xVal, int yVal, int zVal, int newStrength, String newName)
	{
		super(xVal, yVal, zVal);
		strength = newStrength;
		name = newName;
	}
	
	/**
	 * Returns a string detailing the Avatar's name, position and strength
	 */
	public String toString()
	{
		return "Avatar: " +super.toString() + " Name: " + 
				name + " Strength: " + strength+ "\n";
	}
}
