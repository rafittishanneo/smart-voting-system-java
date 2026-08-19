import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.Border;

public class Homepage extends JFrame
{
	JPanel MainP;
	
	public Homepage()
	{
		super("Home Page");
        setSize(1200, 800);
        setLocation(150, 40);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		//Background Panel
		
		MainP = new JPanel();
		MainP.setLayout(null);
		MainP.setSize(1200,800);
		MainP.setBounds(0,0,1200,800);
		MainP.setBackground(new Color(255,232,222));
		add(MainP);
	}
}