//************************************
//COMP 248 - Assignment #3
// Written by: Giulia Gaudio 27191766
// General Description: This class will complete the property portion of the Monopoly game program

package monopoly;

public class Property 
{
	//3 attributes	
	private int valueOfProperty;
	private String nameOfProperty;
	private Object ownerOfProperty = null;

	//copy constructor
	public Property (Property p)
	{
		this.valueOfProperty = p.valueOfProperty;
		this.nameOfProperty = p.nameOfProperty;
		this.ownerOfProperty = p.ownerOfProperty;
	}
	//constructor
	public Property(String string, int randomValue, Object owner) {
		this.valueOfProperty = randomValue;
		this.nameOfProperty = string;
		this.ownerOfProperty = owner;
	}
	//appropriate toString method
	public String toString()
	{
		return this.nameOfProperty + " value: $"+ this.valueOfProperty+ " Owner :"+this.ownerOfProperty;

	}
	//equals method
	public boolean equals (Property anotherProperty)
	{
		return ((this.valueOfProperty == anotherProperty.valueOfProperty) && ((this.nameOfProperty).equals(anotherProperty.nameOfProperty))&& ((this.ownerOfProperty).equals(anotherProperty.ownerOfProperty)));
	}	
	

	public boolean isSmallerThan(Property min) 
	{
		if(this.valueOfProperty < min.valueOfProperty){
			return true;
		}
		else
		{
			return false;
		}
	}
	public void sell(Player player) 
	{
		if(player.getPlayerBudget() >= this.valueOfProperty){
			this.ownerOfProperty = player;
			System.out.print(this.getName() + " value is $"+this.getValue()+" and "+player.getPlayerName()+" has $"+player.getPlayerBudget());
			player.setPlayerBudget(player.getPlayerBudget() - this.getValue());
			System.out.println(" --> SOLD! "+player.getPlayerName()+" has $"+player.getPlayerBudget());
		}
		else
		{
			System.out.print(this.nameOfProperty + " value is $"+this.valueOfProperty+" but "+player.getPlayerName()+" only has $"+player.getPlayerBudget());
			System.out.println(" --> NOT SOLD! "+player.getPlayerName()+" has $"+player.getPlayerBudget());
		}
		
	}
	public Object getOwner() {
		return this.ownerOfProperty;
	}
	public String getName(){
		return this.nameOfProperty;
	}
	public int getValue()
	{
		return this.valueOfProperty;
	}
}	
