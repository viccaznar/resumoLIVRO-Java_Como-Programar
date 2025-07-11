// Fig. 4.18: DrawPanel.java
// Using drawLine to connect the corners of a panel.
package cap4_07JavaExercicios_App_DrawPanelTest;

import javax.swing.JFrame;
import cap4_06JavaExercicios_Class_DrawPanel.DrawPanel;

public class DrawPanelTest
{
	public static void main(String[] args)
	{
		// create a panel that contains our drawing
		DrawPanel panel = new DrawPanel();
		
		// create a new frame to hold the panel
		JFrame application = new JFrame();
		
		// set the frame to exit when it is closed
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		application.add(panel); // add the panel to the frame
		application.setSize(250, 250); // set the size of the frame
		application.setVisible(true); // make the frame visible
	}
} // end class DrawPanelTest

