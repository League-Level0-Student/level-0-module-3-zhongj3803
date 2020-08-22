package _01_else_if._4_are_you_happy;

import javax.swing.JOptionPane;

public class AreYouHappy {
	public static void main(String[] args) {
		String answer = JOptionPane.showInputDialog("Are you happy today?");
		if (answer.equals("yes")) {
			JOptionPane.showMessageDialog(null, "Ok carry on with what you're doing.");
		} else {
			String happyWanna = JOptionPane.showInputDialog("Do you want to be happy?");
			if (happyWanna.equals("yes")) {
				JOptionPane.showMessageDialog(null, "Change something.");
			} else {
				JOptionPane.showMessageDialog(null, "Ok carry on with what you're doing.");
			}
		}
	}
}
