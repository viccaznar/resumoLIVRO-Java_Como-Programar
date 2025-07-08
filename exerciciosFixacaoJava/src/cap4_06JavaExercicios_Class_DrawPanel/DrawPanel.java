// Fig. 4.18: DrawPanel.java
// Using drawLine to connect the corners of a panel.
package cap4_06JavaExercicios_Class_DrawPanel;

import java.awt.Graphics;
import javax.swing.JOptionPane;

public class DrawPanel extends JOptionPane
{
	private static final long serialVersionUID = 1L;

	// draws an X from the corners of the panel
	public void paintComponent(Graphics g)
	{
		// call paintComponent to ensure the panel displays correctly
		super.paintComponent(g);
		
		int width = getWidth(); // total width
		int height = getHeight(); // total height
		
		// draw a line from the upper left to the lower-right
		g.drawLine(0, 0, width, height);
		
		// draw a line from the upper left to the lower-right
		g.drawLine(0, 0, height, width);
	}
} // end class DrawPanel

