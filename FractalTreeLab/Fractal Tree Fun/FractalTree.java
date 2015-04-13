//********************************************************************
//  FractalTree.java      Author: Michael Carlston
//
//  Draws a Fractal Tree using recursive methods
//********************************************************************

import java.awt.*;
import javax.swing.JPanel;

public class FractalTree extends JPanel
{
   private final int PANEL_WIDTH = 1000;
   private final int PANEL_HEIGHT = 1000;

   private final double ANGLE = .5;
   
   private int ag = 30;

   private final int TOPX = 200, TOPY = 20;
   private final int LEFTX = 60, LEFTY = 300;
   private final int RIGHTX = 340, RIGHTY = 300;

   private int current;

   public FractalTree (int current1)
   {
      current = current1;
      setBackground (Color.black);
      setPreferredSize (new Dimension(PANEL_WIDTH, PANEL_HEIGHT));
   }


   public void drawFractal (int x1, int y1, double ANGLE, int order, Graphics g )
   {
       if(order != 0)
       {
           int x2 = x1 + (int) (Math.cos(Math.toRadians(ANGLE)) * order * 10.0);
           int y2 = y1 - (int) (Math.sin(Math.toRadians(ANGLE)) * order * 10.0);
           g.drawLine(x1,y1,x2,y2);
           drawFractal(x2,y2, ANGLE+ag, order-1, g);
           drawFractal(x2,y2,ANGLE-ag, order -1, g);
       }
   }
      
   

   
   public void paintComponent (Graphics page)
   {
       
       super.paintComponent (page);
       page.setColor(Color.green);
       drawFractal(500,600 , 90, 10, page);
      
      
   }
}
