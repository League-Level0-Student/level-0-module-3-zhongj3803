
package _01_else_if._1_robot_color_chooser;

import javax.swing.JOptionPane;
import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class RobotColorChooser {
	public static void main(String[] args) {

		// 1. Create a new Robot
		Robot rob = new Robot();
		// 2. Make the robot draw a shape (this will take more than one line of code)
		for (;;) {
			String colorPen = JOptionPane.showInputDialog("What color would you like the robot to draw with?");
			if (colorPen.equals("red")) {
				rob.setPenColor(Color.red);
			} else if (colorPen.equals("orange")) {
				rob.setPenColor(Color.orange);
			} else if (colorPen.equals("yellow")) {
				rob.setPenColor(Color.yellow);
			} else if (colorPen.equals("green")) {
				rob.setPenColor(Color.GREEN);
			} else if (colorPen.equals("blue")) {
				rob.setPenColor(Color.blue);
			} else if (colorPen.equals("magenta")) {
				rob.setPenColor(Color.magenta);
			} else {
				rob.setRandomPenColor();
			}

			rob.penDown();
			rob.setSpeed(50);
			rob.setPenWidth(10);
			for (int i = 0; i < 4; i++) {
				rob.move(100);
				rob.turn(90);
			}
		}
	}
}

// 3. Set the pen width to 10
// 4. Ask the user what color pen they would like the robot to draw with

// 5. Use an if/else statement to set the pen color that the user requested

// 6. If the user doesn't enter anything, choose a random color

// 7. Put a loop around your code so that you keep asking the user for more
// colors & drawing them
