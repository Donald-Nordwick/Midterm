import java.util.Scanner;

public class Midterm {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int i = 1;
		double evenGuess = 0; 			//keeps track of even guesses
		double oddRoll = 0;				//keeps track of the amount of odd rolls
		double perEvenGuess = 0;		//keeps track of the percentage of even guesses
		double perOddRoll = 0;			//keeps track of the percentage of odd rolls
		double won = 0;					//keeps track of the amount of times the player won
		double lost = 0;				//keeps track of the amount of times the player lost
		double tries = 0;				//keeps track of the number of tries
		double perWon = 0;				//keeps track of the percentage that the player won
		double perLost = 0;				//keeps track of the percentage that the player lost

		String response=null;
		while (i == 1) {
			int gameNum = 1 + (int) (Math.random()* 2);
			
			/* Because the game is only having the player guess odd or even I can have the program 
			 * generate 1 or 2 for my odd or even*/
			
			
			System.out.println("Guess if the dice is odd or even. Use 1 for odd and 2 for even.");
			int ans = input.nextInt();
			if ((ans < 1) || (ans > 2)) {
				System.out.println("Please use either 1 or 2");

			}
			if ((ans == 1) || (ans == 2)) {
				if (ans == gameNum) {
					response = "You guessed right";
					won += 1;
					tries += 1;
					if (ans == 2) {
						evenGuess += 1;
					} else {
						oddRoll += 1;
					}
				} else {
					response = "Sorry you guessed wrong";
					lost += 1;
					tries += 1;
					if (ans == 2) {
						oddRoll += 1;
						evenGuess += 1;
					}
				}
			}
			perWon = won / tries * 100;
			perLost = lost / tries * 100;
			perOddRoll = oddRoll / tries * 100;
			perEvenGuess = evenGuess / tries * 100;

			System.out.printf(
					"%s.\nSo far you have guessed %.1f times and won %.2f percent of the time and lost"
							+ " %.2f percent of the time.\nSo far the computer has rolled odds about %.2f"
							+ " percent of the time and you have guessed even about %.2f percent of the time."
							+ "\nWould you like to play again?\nPress 1 for yes.",
					response, tries, perWon, perLost, perOddRoll, perEvenGuess);
			i = input.nextInt();
		}

	}
}