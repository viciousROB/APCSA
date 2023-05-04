//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Cedric McEnroe
//Date - 9/17/2019
//Class - 4th Period
//Lab  - Shape Lab

import java.awt.Color;
import java.awt.Graphics;

public class Shape
{
   //instance variables
	private int xPos;
	private int yPos;
	private int width;
	private int height;
	private Color color;

   public Shape(int x, int y, int wid, int ht, Color col)
   {
		xPos = x+100;
      yPos = y-100;
      width = wid/2;
      height = ht*2;
      color = col;
   }


   public void draw(Graphics window)
   {
      window.setColor(color);
      window.fillRect(xPos, yPos, width, height);
      window.setColor(color);
      window.fillRect(xPos+50, yPos+25, width+50, height-50);
      window.setColor(Color.RED);
      window.fillRect(xPos-25, yPos+25, width+20, height-90);
      window.setColor(Color.CYAN);
      window.fillOval(xPos+20, yPos, (width+47)/5, height+44);
      window.setColor(Color.BLACK);
      window.drawLine(xPos+30, yPos+30, xPos, yPos);
      

   }

   public String toString()
   {
   	return xPos+" "+yPos+" "+width+" "+height+" "+color;
   }
}