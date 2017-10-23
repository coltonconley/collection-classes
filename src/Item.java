/*************************************************************
 * Item Class
 * 
 * Description: Each Item holds a set of coordinates. The class 
 * provides a constructor, a compareTo method based on the z
 * coordinate, and a toString() method  which converts the 
 * coordinates to a string.
 **************************************************************/
public abstract class Item implements Comparable {
	
	int x, y, z; //coordinates of the item
	
	/**
	 * Constructor
	 */
	public Item(int xVal, int yVal, int zVal)
	{
		x = xVal;
		y = yVal;
		z = zVal;
	}
	
	/**
	 * returns a positive int if the z value is higher,
	 * a negative if it is lower and 0 if they are equal
	 */
	public int compareTo(Object obj)
	{
		return z - ((Item)obj).z;
	}
	
	/**
	 * Returns a string detailing the Item's position
	 */
	public String toString()
	{
		return ""+x+", "+y+", "+z;
	}
}
