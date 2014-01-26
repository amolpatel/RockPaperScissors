import java.util.*;

/*
 * The RPSTournament class is responsible for handling the user interface for a rock, paper,
 * and scissors game. The input and output for the RPSGame class is done here
 * and it also instantiates new players and handles a random computer as player.  
 * 
 * @author Amol Patel
 * version 1.0 02/13/2013
 */
public class RPSTournament
{
	final String rock = "rock";
	final String scissors = "scissors";
	final String paper = "paper";
	
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);

		System.out.print("Please enter your name: ");
		String name = scan.nextLine();
		
		RPSPlayer Player1 = new RPSPlayer(name);
		RPSPlayer Player2 = new RPSPlayer("Computer");
		
		System.out.print("Please enter the number of games you wish to play: ");
		int games = scan.nextInt();
		System.out.println();
		String choice1 = scan.nextLine();
		for (int i = 0; i < games; i++)
		{
			System.out.print(Player1.getName() + ", enter your choice: " );
			
			choice1 = scan.nextLine();
			String choice2 = generateChoice();
			System.out.print("Your rival chose " + choice2);
			RPSGame game = new RPSGame(Player1, Player2, choice1, choice2);
			System.out.print("Current score: \t" + Player1.getName() + " - " + Player1.getScore() + " \t" + Player2.getName() + " - " + Player2.getScore());
			System.out.println();
		}
		if (Player1.getScore() > Player2.getScore())
		{
			System.out.print(Player1.getName() + " won, with " + Player1.getScore() + "/" + games+ " total games."); 
		}
		else
		{
		System.out.print(Player2.getName() + " won, with " + Player2.getScore() + "/" + games+ " total games."); 
		}
	}
	
	/*
	 * Returns the random choice of a computer player after generating a random number
	 * 
	 * @return either rock, paper, or scissors based on the random number generated
	 */
	public static String generateChoice()
	{
		Random r = new Random();
		int num = r.nextInt(2);
		if (num == 0)
			return "rock";
		if (num == 1)
			return "scissors";
		if (num == 2)
			return "paper";
		return "";
	}
}
