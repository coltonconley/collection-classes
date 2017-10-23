/*************************************************************
 * Tree Class
 * 
 * Description: Each tree holds a set of coordinates and a height
 * (double). The class provides a constructor and a toString() method 
 * is provided which displays the height and the 
 * coordinates(x, y, then z).
 **************************************************************/
public class Tree extends Item {
	
	private double height; //height of the tree
	
	/**
	 * Constructor
	 */
	public Tree(int xVal, int yVal, int zVal, int newHeight)
	{
		super(xVal, yVal, zVal);
		height = newHeight;
	}
	
	/**
	 * Returns a string detailing the tree's position and height
	 */
	public String toString()
	{
		return "Tree: " + super.toString() + " Height: " + height + "\n";
	}
}
