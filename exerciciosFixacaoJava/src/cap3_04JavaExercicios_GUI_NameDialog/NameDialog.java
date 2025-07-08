// Fig. 3.13: NameDialog.java
// Obtaining user input from a dialog.
package cap3_04JavaExercicios_GUI_NameDialog;

import javax.swing.JOptionPane;

public class NameDialog
{
	public static void main(String[] args)
	{
		// prompt user to enter name
		String name = JOptionPane.showInputDialog("What is your name?");
		
		// create the message
		String message =
				String.format("Welcome, %s, to Java Programming!", name);
		
		// display the message to w
		JOptionPane.showMessageDialog(null, message);
	} // end main
} // end class NameDialog