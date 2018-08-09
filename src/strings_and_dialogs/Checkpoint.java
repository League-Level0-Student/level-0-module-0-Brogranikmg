package strings_and_dialogs;

import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MoveAction;

import org.jointheleague.graphical.robot.Robot;

public class Checkpoint {
	public static void main(String[] args) {
		String color = JOptionPane.showInputDialog("What's your favorite color?");
		JOptionPane.showMessageDialog(null, "Wow, that's a coincidence! My favorite color is also " + color + "!");
		Robot dingus = new Robot();
		dingus.penDown();
		for (int i = 0; i < 3; i++) {
			dingus.move(100);
			dingus.turn(120);
		}
	}
}
