/*
 * This RPSGame class is responsible for handling the logic behind a
 * game of rock paper scissors. It can handle a game between two players.
 * 
 * @author Amol Patel
 * version 1.0 02/13/2013
 */
public class RPSGame
{
	final String rock = "rock";
	final String scissors = "scissors";
	final String paper = "paper";
	
	
	/*
	 * Takes in two players and two choices. The choices have to be either rock, scissors, or paper. It 
	 * then checks to see which player has won by comparing their choices, and then increases the score for 
	 * that respective player. 
	 * 
	 * @param Player1 player 1 is assigned to this variable
	 * @param Player2 player 2 is assigned to this variable
	 * @param choice1 the choice of player 1 is assigned to this variable
	 * @param choice2 the choice of player 2 is assigned to this variable
	 */
	public RPSGame(RPSPlayer Player1, RPSPlayer Player2, String choice1, String choice2)
	{

		Player1.setChoice(choice1);
		Player2.setChoice(choice2);
		
		if ( (Player1.getChoice().equals( rock)) && (Player2.getChoice().equals(rock)) )
		{
			System.out.println("You tied!");
		}
		if ( (Player1.getChoice().equals(scissors)) && (Player2.getChoice().equals(scissors)) )
		{
			System.out.println("You tied!");
		}
		if ( (Player1.getChoice().equals(paper)) && (Player2.getChoice().equals(paper)) )
		{
			System.out.println("You tied!");
		}
		if ( (Player1.getChoice().equals(rock)) && (Player2.getChoice().equals(paper)) )
		{
			System.out.println(Player2.getName() + " won this game.");
			Player2.increaseScore();
		}
		if ( (Player2.getChoice().equals(rock)) && (Player1.getChoice().equals(paper)) )
		{
			System.out.println(Player2.getName() + " won this game.");
			Player1.increaseScore();
		}
		if ( (Player1.getChoice().equals(scissors)) && (Player2.getChoice().equals(paper)) )
		{
			System.out.println(Player1.getName() + " won this game.");
			Player1.increaseScore();
		}
		if ( (Player2.getChoice().equals(scissors)) && (Player1.getChoice().equals(paper)) )
		{
			System.out.println(Player2.getName() + " won this game.");
			Player2.increaseScore();
		}
		if ( (Player2.getChoice().equals(rock)) && (Player1.getChoice().equals(scissors)) )
		{
			System.out.println(Player2.getName() + " won this game.");
			Player2.increaseScore();
		}
		if ( (Player1.getChoice().equals(rock)) && (Player2.getChoice().equals(scissors)) )
		{
			System.out.println(Player1.getName() + " won this game.");
			Player1.increaseScore();
		}

	}
}
