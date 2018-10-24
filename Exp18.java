import java.awt.*;
import java.applet.*;
import java.awt.event.*;
public class Exp18 extends Applet implements ActionListener
{   
	String actionMessage="";
   	TextField name,pass;
    	Button b1,b2;
    	public void init()
    	{
        	Label n=new Label("Name:");
        	Label p=new Label("Runs");
        	name=new TextField(20);
        	pass=new TextField(20);
        	b1=new Button("Add");
        	b2=new Button("Cancel");
        	add(n);
        	add(name);
        	add(p);
        	add(pass);
        	add(b1);
        	add(b2);
        	n.setBounds(25,45,70,20);
        	p.setBounds(20,95,70,20);
        	name.setBounds(180,45,200,20);
        	pass.setBounds(180,95,200,20);
        	b1.setBounds(300,260,70,20);
        	b2.setBounds(300,260,70,40);
		b1.addActionListener(this);
		b2.addActionListener(this);
	}
    	public void paint(Graphics g)
	{
        	g.drawString(actionMessage,200,150);
        }
        public void actionPerformed(ActionEvent ae)
	{                
        	String action = ae.getActionCommand();
                if(action.equals("Add"))
                        actionMessage = "Added Successfully";
                else if(action.equals("Cancel"))
                        actionMessage = "Cancelled";                
                repaint();
        }
}