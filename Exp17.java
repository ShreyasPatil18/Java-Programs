import java.awt.*;
import java.applet.*;

public class Exp17 extends Applet
{
	public void init() 
        {
		setBackground(Color.white);
		setFont(new Font("Century Gothic",Font.BOLD,30));
	}
	public void paint(Graphics g) 
      	{
		Color red=new Color(255,0,0);
		Color green=new Color(0,255,0);
		Color blue=new Color(0,0,255);	   
		Color black=new Color(0,0,0);    
                g.drawString("Shapes",30,30);
		g.drawRect(20,200,100,100);
		g.setColor(red);
 		g.fillRect(20,400,100,100);
		g.setColor(black);
		g.drawRoundRect(200,200,100,100,10,10);
		g.setColor(blue);
		g.fillRoundRect(200,400,100,100,10,10);
		g.setColor(black);
		g.drawOval(400,200,100,100);
		g.setColor(green);
		g.fillOval(400,400,100,100);
		g.setColor(black);
		g.drawArc(600,200,100,100,180,180);
		g.fillArc(600,400,100,100,180,180);	
	}
}