//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Cedric McEnroe
//Date - 9/17/2019
//Class - 4th Period
//Lab  - Robot Lab

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Canvas;

class Robot extends Canvas
{
   public Robot()    //constructor method - sets up the class
   {
      setSize(800,600);
      setBackground(Color.WHITE);   	
      setVisible(true);
   }

   public void paint( Graphics window )
   {
      window.setColor(Color.BLUE);

      window.drawString("Robot LAB ", 35, 35 );

      //call head method
      head(window);
      upperBody(window);
      lowerBody(window);
      //call other methods
      
   }

   public void head( Graphics window )
   {
      window.setColor(Color.YELLOW);

      window.fillOval(300, 50, 200, 100);
      window.setColor(Color.GREEN);
      window.fillOval(350, 70, 15, 25);
      window.setColor(Color.GREEN);
      window.fillOval(450, 70, 15, 25);
      window.setColor(Color.BLACK);
      window.fillOval(400, 90, 15, 15);
      window.setColor(Color.RED);
      window.drawArc(370,40,75,90,-140,95);

		//add more code here
				
   }

   public void upperBody( Graphics window )
   {

		//add more code here
      //drawLine(int x1, int y1, int x2, int y2)
		window.setColor(Color.BLUE);
      window.fillRect(300, 200, 200, 125);

      window.setColor(Color.YELLOW);
      window.drawRect(300, 200, 200, 125);
      window.setColor(Color.BLACK);
      window.drawLine(200, 150, 300, 200);
      window.setColor(Color.BLACK);
      window.drawLine(600, 150, 500, 200);
   }

   public void lowerBody( Graphics window )
   {

		window.setColor(Color.GRAY);
      window.fillRect(300, 350, 200, 125);

      window.setColor(Color.YELLOW);
      window.drawRect(300, 350, 200, 125);
      window.setColor(Color.BLACK);
      window.drawLine(500, 475, 600, 550);
      window.setColor(Color.BLACK);
      window.drawLine(300, 475, 200, 550);

   }
}