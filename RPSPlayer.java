/*
 * This RPSPlayer class is responsible for implementing a name, a score,
 * and a choice of either rock, paper, or scissors to a player. It is also
 * responsible for handling the score operation.
 * 
 * @author Amol Patel
 * version 1.0 02/13/2013
 */

public class RPSPlayer {

	private String name, choice;
	private int score;
	
	/*
	 * Takes the name variable and assigns it to a string 
	 * 
	 * @param n a string that is assigned with the variable name
	 */
	public RPSPlayer (String n){
		this.name = n;
	}
	
	/*
	 * Returns the name of the player
	 * 
	 * @return name of player
	 */
	public String getName(){
		return name;
	}
	
	/*
	 * Returns the choice of the player
	 * 
	 * @return choice of player
	 */
	public String getChoice(){
		return choice;
	}
	
	/*
	 * Sets the choice of the player to String c
	 * 
	 * @param c the choice variable is assigned to this String c
	 */
	public void setChoice(String c){
		this.choice = c;
	}
	
	
	//Increases the score variable by one
	public void increaseScore(){
		this.score += 1;
	}
	
	/*
	 * Returns the score of the player
	 * 
	 * @return score of the player
	 */
	public int getScore(){
		return score;
	}
}
