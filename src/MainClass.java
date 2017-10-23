import java.util.*;
/******************************************************************************
*
* Name: Colton Conley
* Block: A
* Date: 4/2/15
*
* Collection Classes
* Description:
* The objective of this program was to practice using collection classes and 
* create different data structures containing items that would appear in a 3D
* game.  The program prints out the data from each of these data structures, 
* and some are sorted based on the z position value, depending on the structure
* used.  
******************************************************************************/
public class MainClass {

	public static final int POWER_SCALE = 20; //range of values to be used for avatar creation

	public static void main(String[] args) {
		System.out.println("****************************************** Hash Set");
		HashSet<Item> hashSet = generateHashSet();
		Display(hashSet);
		
		//sorted list
		System.out.println("****************************************** Sorted List");
		List<Item> sortedList = setToList(hashSet);
		Display(sortedList);
		
		//Tree set
		System.out.println("****************************************** Tree Set");
		TreeSet<Item> treeSet = hashToTree(hashSet);
		Display(treeSet);
		
		//Priority Queue
		System.out.println("****************************************** Priority Queue");
		PriorityQueue<Item> queue = setToPriorityQueue(hashSet);
		Display(queue);
		
		System.out.println("******************************************");
		System.out.println(scrambleWord("ArA"));


		
	}

	/**
	 * Generates a hash set of ten items, randomly generated
	 * 
	 * @return		Returns a hash set of ten items
	 */
	private static HashSet<Item> generateHashSet()
	{
		HashSet<Item> hashSet = new HashSet<Item>();
		for(int i = 0; i < 10; i++)
		{
			addItem(hashSet, i);
		}
		return hashSet;
	}

	/**
	 * Adds a random item to a set of items
	 * 
	 * @param set			Set to which an item will be added
	 * @param number		number to be used in naming an avatar
	 * 						item, if one is created
	 */
	private static void addItem(Set<Item> set, int number)
	{
		//randomly decide the type of item
		if(Math.random() > Math.random())
		{
			set.add(new Avatar(randomInt(), 
					randomInt(), randomInt(), 
					randomInt(),  "Avatar" + number));
		}
		else
		{
			set.add(new Tree(randomInt(), 
					randomInt(), randomInt(), randomInt()));
		}
	}

	/**
	 * Generates a random integer depending on the POWER_SCALE
	 * variable
	 * 
	 * @return		returns a random integer
	 */
	private static int randomInt()
	{
		return (int)(Math.random() * POWER_SCALE);
	}

	/**
	 * Converts a set of Items to a list, sorting the items
	 * in the list based on their z values in descending
	 * order
	 * 
	 * @param set		Set to be converted to a List
	 * @return			returns a sorted List
	 */
	private static List<Item> setToList(Set<Item> set)
	{
		Iterator<Item> it = set.iterator();

		LinkedList<Item> list = new LinkedList<Item>();
		
		while(it.hasNext())
		{
			//item is added in correct position
			addItemToList(it.next(), list);
		}
		
		return list;
	}
	
	/**
	 * Adds an item to the list in the appropriate position
	 * 
	 * @param item		Item to be added to the list
	 * @param list		List of Items
	 */
	private static void addItemToList(Item item, List<Item> list)
	{
		int index = 0;
		
		//find correct index
		while (index < list.size() && list.get(index).compareTo(item) > 0)
		{
			index++;
		}
		
		list.add(index, item);
	}
	

	/**
	 * Converts any set of Items into a tree set
	 * 
	 * @param set	Set of items to be converted to a tree set
	 * @return		Returns a tree set containing the items
	 * 				from the given Set
	 */
	private static TreeSet<Item> hashToTree(Set<Item> set)
	{
		TreeSet<Item> treeSet = new TreeSet<Item>();
		for(Item newItem : set)
		{
			treeSet.add(newItem);
		}
		return treeSet;
	}

	/**
	 * Converts a set of Items into a priority queue of Items
	 * 
	 * @param set		Set containing data to full priority queue
	 * @return			Returns a priority queue containing data
	 * 					from the given set
	 */
	private static PriorityQueue<Item> setToPriorityQueue(Set<Item> set)
	{
		
		PriorityQueue<Item> priorityQueue = new PriorityQueue<Item>();
		for(Item newItem : set)
		{
			priorityQueue.add(newItem);
		}
		return priorityQueue;
	}
	
	/**
	 * Displays any collection of items
	 * 
	 * @param items		Items to be displayed
	 */
	private static void Display(Collection<Item> items)
	{
		Iterator<Item> it = items.iterator();

		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}

	
	
	private static String scrambleWord(String word)
	{
		int numLetters = word.length();
		int index = 0;
		String newWord = "";
		while (index < numLetters)
		{
			if(word.charAt(index) == 'A')
			{
				if(index+1 < numLetters)
				{
				newWord = newWord + word.substring(index+1, index+2) + "A";
				index++;
				}
			}
			index++;
		}
		
		return newWord;
	}
	
	
}







