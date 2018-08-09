package strings_and_dialogs;


import javax.swing.JOptionPane;

public class EverythingIsAwesome {
	public static void main(String[] args) {
		// well originally you were supposed to say whatever they typed was awesome
		// but i guess its still accurate because you could type "everything is awesome"
		String dwemer = JOptionPane.showInputDialog("What's your favorite, uh... thing?");
		JOptionPane.showMessageDialog(null, "Wooooooooooow. What are ya, some kinda " + dwemer + " fanatic? Get outta here.");
	}
}

// now get outta my program, you Everything is Awesome fanatic