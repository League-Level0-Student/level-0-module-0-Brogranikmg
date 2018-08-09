package strings_and_dialogs;

import javax.swing.JOptionPane;

public class LastSummer {
	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog("What's your name?");
		JOptionPane.showMessageDialog(null, "I know about all those crimes you did last summer, " + name + "... And soon, the whole world will too!");
		JOptionPane.showMessageDialog(null, "MUAHAHAHAHAHA!");
	}
}
