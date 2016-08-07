package monopoly;


/**
 * This class is a driver for the {@link Monopoly} class. It creates a game and simulates one turn for all players.
 * @author TA ;)
 *
 */
public class MonopolyDriver {

	public static void main(String[] args) {
		Monopoly game = new Monopoly();
		System.out.println("Welcome to my Monopoly Game!");
		System.out.println("");
		System.out.println("Here are 10 random properties:" );
		game.displayBoard();
		
		System.out.println("\n\nThe properties sorted by their values:");
		game.sort();
		game.displayBoard();
		
		System.out.println("\n\nLet's try to sell the properties to random persons:");
		game.sell();
		
		System.out.println("\n\nThe properties with their new owners:");
		game.displayBoard();
		System.out.println("Thanks for playing!");
	}
}