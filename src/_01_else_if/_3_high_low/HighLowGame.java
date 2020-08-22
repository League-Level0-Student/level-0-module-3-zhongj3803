
package _01_else_if._3_high_low;

import java.util.Random;

import javax.swing.JOptionPane;

public class HighLowGame {

	public static void main(String[] args) {
		// 3. Change this line to give you a random number between 1 - 100.
		int random = new Random().nextInt(99) + 1;

		// 2. Print out the random variable above
System.out.println(random);
		// 11. Repeat steps 1 to 10 ten times
for (int i=0; i<10; i++) {
		// 1. Ask the user for a guess using a pop-up window, and save their response
		String guess = JOptionPane.showInputDialog("Guess a number.");
		// 4. Convert the users’ answer to an int (Integer.parseInt(string))
		int guessInt = Integer.parseInt(guess);
		// 5. if the guess is correct
if (guessInt == random) {
	

		// 6. Win
	JOptionPane.showMessageDialog(null, "YOU GOT IT!");

		// 12. Use "System.exit(0);" to quit the game if the user guessed the right
		// answer.
	System.exit(0);
}
		// 7. if the guess is high
else if (guessInt > random) {

		// 8. Tell them it's too high
	JOptionPane.showMessageDialog(null, "Too high");
}
		// 9. if the guess is low
else if (guessInt < random) {
	

		// 10. Tell them it's too low
JOptionPane.showMessageDialog(null,"Too low");
}
}
		// 13. Tell them they lose
JOptionPane.showMessageDialog(null, "You lost :D");
	}

}
