//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Cedric McEnroe
//Date - 9/17/2019
//Class - 4th Period
//Lab  - Big House

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Canvas;

public class BigHouse extends Canvas
{
   public BigHouse()  //constructor - sets up the class
   {
      setSize(800,600);
      setBackground(Color.WHITE);
      setVisible(true);
   }

   public void paint( Graphics window )
   {
      bigHouse(window);
   }

   public void bigHouse( Graphics window )
   {
      window.setColor(Color.BLUE);
      window.drawString( "BIG HOUSE ", 50, 50 );
      window.setColor(Color.BLUE);
      window.fillRect( 200, 200, 175, 400 );
      window.setColor(Color.BLUE);
      window.fillRect( 375, 200, 100, 200 );
      window.setColor(Color.BLUE);
      window.fillRect( 475, 200, 175, 400 );
      window.setColor(Color.YELLOW);
      window.fillRect( 280, 275, 80, 80);
      window.setColor(Color.YELLOW);
      window.fillRect( 500, 275, 80, 80);
      window.setColor(Color.GREEN);
      window.fillRect( 100, 100, 650, 100);
      

   }
}