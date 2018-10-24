import java.awt.*;
import java.applet.*;
public class Exp16 extends Applet
{
	public void init() 
	{
        	setBackground(Color.white);
        	setFont(new Font("Century Gothic",Font.BOLD,20));
	}

	public void paint(Graphics g) 
        {   
		String Name;
		int age;
		Name=getParameter("Name");
		age=Integer.parseInt(getParameter("Age"));
        	g.drawString(Name+" is "+age+" year old ",50,50);
	}
}
/*
<applet code=Exp16.class width=200 height=200>
<param name=Name value="Devi">
<param name=Age value=18>
</applet>
*/