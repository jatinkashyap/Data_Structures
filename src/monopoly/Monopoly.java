package monopoly;


import java.util.Random;

/**
 * This class implements all the rules of the game. It also sort the properties to show to the user (check {@link #sort()}.
 * 
 * @author majid
 *
 */
public class Monopoly  {
	// The maximum value of a property.
	public static final int MAX_PROPERTY_VALUE = 100000;
	// The minimum value of a property.
	public static final int MIN_PROPERTY_VALUE = 1000;

	// The maximum budget of a player
	public static final int MAX_BUDGET_VALUE = 100000;
	// The minimum budget of a player
	public static final int MIN_BUDGET_VALUE = 1000;
	
	//The number of property in the game.
	public static final int NUM_PROPERTY = 10;
	//The number of player in the game.
	public static final int NUM_PLAYER = 10;
	
	private Property[] properties;
	private Player[] players;
	private Random random = new Random();

	public Monopoly() {
		
		//randomly initialize the game
		//Initialize the properties
		properties = new Property[NUM_PROPERTY];
		for (int i=0; i < NUM_PROPERTY; i++) {
			int randomValue;
			randomValue = random.nextInt(MAX_PROPERTY_VALUE - MIN_PROPERTY_VALUE) + MIN_PROPERTY_VALUE;
			properties[i] = new Property("Property-" + i, randomValue, null);
		}
		
		//Initialize the players
		players = new Player[NUM_PLAYER];
		for (int i = 0; i < NUM_PLAYER; i++){
			int randomBudget = random.nextInt(MAX_BUDGET_VALUE - MIN_BUDGET_VALUE) + MIN_BUDGET_VALUE;
			players[i] = new Player(randomBudget, "Player-" + i);
		}
	}

	/**
	 * For each player, a property is randomly selected. Then if the player can buy the property, 
	 * the property will be sold to the player. If the property was sold before, nothing will be changed. 
	 */
	public void sell(){
		for (int i = 0; i < players.length; i++){
			int randomPropertyIdx = random.nextInt(properties.length);
			Property propertyToBeSold = properties[randomPropertyIdx];
			if (propertyToBeSold.getOwner() == null)	//nobody has bought this property yet!
				propertyToBeSold.sell(players[i]);
		}
	}

	/**
	 * Show the board in the console.
	 */
	public void displayBoard(){ 
		for (int i=0; i<properties.length; i++){
			System.out.println(properties[i]);
		}
	}

	/**
	 * Sort the properties. This implementation implement bubble sort. 
	 * (@see <a href="http://en.wikipedia.org/wiki/Bubble_sort">http://en.wikipedia.org/wiki/Bubble_sort</a>) 
	 */
	public void sort() {
		int indexOfTheSmallest, indexToBeUsed;
		for (indexToBeUsed = 0 ; indexToBeUsed < properties.length; ++indexToBeUsed){
			indexOfTheSmallest = findTheSmallest(indexToBeUsed);
			interchange(indexToBeUsed, indexOfTheSmallest);
		}
	}

	/**
     * Returns the index of the smallest value among
     * a[firstIndex], a[firstIndex + 1], ... a[firstIndex - 1]
	 */
	private int findTheSmallest(int firstIndex){
		Property min = properties[firstIndex];
		int indexOfMin = firstIndex;
		int index;
		for (index = firstIndex + 1; index < properties.length; index++){
			if (properties[index].isSmallerThan(min)){
				min = properties[index];
				indexOfMin = index;
			}
		}
		return indexOfMin;
	}

	/**
     * Precondition: i and j are legal indices for the array a.
     * Postcondition: Values of a[i] and a[j] have been interchanged.
	 */
	private void interchange(int i, int j){
		Property temp;
		temp = new Property(properties[i]);	//it is possible to not copy the object, but we like to test the copy constructor :)
		properties[i] = properties[j];
		properties[j] = temp;  //original value of a[i]
	}


}
