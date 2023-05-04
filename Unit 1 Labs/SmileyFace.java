//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Cedric McEnroe
//Date - 9/16/2019
//Class - 4th Period
//Lab  - SmileyFace

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Canvas;


public class SmileyFace extends Canvas
{

   public SmileyFace()    //constructor - sets up the class
   {
      setSize(800,600);
      setBackground(Color.WHITE);
      setVisible(true);
   }

   public void paint( Graphics window )
   {
      smileyFace(window);
   }

   public void smileyFace( Graphics window )
   {
      window.setColor(Color.BLUE);
      window.drawString("SMILEY FACE LAB ", 35, 35);
      window.setColor(Color.GRAY);
      window.fillOval(100,100,100,100);
      window.setColor(Color.GRAY);
      window.fillOval(200,100,100,100);
      window.setColor(Color.BLACK);
      window.drawOval(100,100,100,100);
      window.setColor(Color.BLACK);
      window.drawOval(200,100,100,100);
      window.setColor(Color.GRAY);
      window.fillRect(150,150,100,300);
      window.fillOval(150,400,100,100);
      window.setColor(Color.BLACK);
      window.drawLine(150,450,250,450);
      window.drawLine(200,500,200,475);
      /*
      window.setColor(Color.YELLOW);
      window.fillOval( 210, 100, 400, 400 );
      window.setColor(Color.GREEN);
		window.fillOval(300,200,65,40);
      window.setColor(Color.GREEN);
		window.fillOval(450,200,65,40);
      window.setColor(Color.BLACK);
      window.fillOval(390,280,35,35);
      window.setColor(Color.RED);
      window.drawArc(300,180,200,230,-140,95);
      */
		//add more code here

   }
}