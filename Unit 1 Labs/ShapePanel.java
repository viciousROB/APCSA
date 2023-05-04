//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Cedric McEnroe
//Date - 9/19/2019
//Class - 4th Period
//Lab  - ShapePanel

import java.awt.Font;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Canvas;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ShapePanel extends JPanel
{
	public ShapePanel()
	{
		setBackground(Color.WHITE);
		setVisible(true);
	}

	public void update(Graphics window)
	{
		paint(window);
	}

	/*
	 *All of your test code should be placed in paint.
	 */

	public void paint(Graphics window)
	{
		window.setColor(Color.WHITE);
		window.fillRect(0,0,getWidth(), getHeight());
		window.setColor(Color.BLUE);
		window.drawRect(20,20,getWidth()-40,getHeight()-40);
		window.setFont(new Font("TAHOMA",Font.BOLD,18));
		window.drawString("CREATE YOUR OWN SHAPE!",40,40);
      
      Shape sh1 = new Shape(300,200,50,50,Color.GREEN);
      sh1.draw(window);
      
      Shape sh2 = new Shape(400, 400, 30, 30, Color.GRAY);
      sh2.draw(window);
      
      Shape sh3 = new Shape(500, 600, 90, 90, Color.YELLOW);
      sh3.draw(window);

      Shape sh4 = new Shape(100, 150, 45, 10, Color.BLACK);
      sh4.draw(window);
	}
}