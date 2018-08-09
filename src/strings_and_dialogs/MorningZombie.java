package strings_and_dialogs;

import javax.swing.JOptionPane;

public class MorningZombie {
	public static void main(String[] args) {
		String routine[] = {"First...","I wake up.","Then...","I climb out of my bed.","After that...","I reach to my box of deer skulls for comfort.","Then I pour some cereal.","Then I eat the cereal.","...and wash it down with some goat blood.","Then, as I've spent the entire day touching skulls and drinking blood, I go back to sleep.","Another \"successful\" day!","Actually that was a lie.","Want to hear the full story?","Here it is:"};
		for (int i = 0; i < 1000; i++) {
			JOptionPane.showMessageDialog(null, routine[i % routine.length]);
		}
	}
}