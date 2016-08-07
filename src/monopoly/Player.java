//************************************
//COMP 248 - Assignment #3
// Written by: Giulia Gaudio 27191766
// General Description: This class will complete the player portion of the Monopoly game program



package monopoly;

public class Player {

//2 attributes
	public String playerName;
	public int playerBudget;

//copy constructor
	public Player (Player p)
	{
		this.playerName = p.playerName;
		this.playerBudget= p.playerBudget;
	}
	public Player(int randomBudget, String name) {
		this.playerName = name;
		this.playerBudget = randomBudget;
	}
//appropriate toString method
	public String toString()
	{
		return "<"+this.playerName+ " with $" + this.playerBudget+">";

	}
//appropriate accessor methods
	public String getPlayerName()
	{
		return this.playerName;
	}
	
	public int getPlayerBudget()	
	{
		return this.playerBudget;
	}
	
	public void setPlayerBudget(int value)
	{
		this.playerBudget = value; 
	}
}