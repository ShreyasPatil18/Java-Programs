import java.awt.*;
import java.awt.event.*;
public class Exp18 extends Frame implements ActionListener
{
	Button rb,gb,bb;
	public Exp18()
	{
		FlowLayout f1=new FlowLayout();
		setLayout(f1);
		rb=new Button("Red");
		gb=new Button("Green");
		bb=new Button("Blue");
		rb.addActionListener(this);
		gb.addActionListener(this);
		bb.addActionListener(this);
		add(rb);
		add(gb);
		add(bb);
		setSize(300,300);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{
		String str=e.getActionCommand();
		if(str.equals("Red"))
		{
			setBackground(Color.red);
		}
		else if(str.equals("Green"))
		{
			setBackground(Color.green);
		}		
		else if(str.equals("Blue"))
		{
			setBackground(Color.blue);
		}
	}
	public static void main(String a[])
	{
		new Exp18();
	}
}
