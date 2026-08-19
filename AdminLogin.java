package GUI;
import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.Border;
import Entity.*;
//import data.*;
//import Image.*;

public class AdminLogin extends JFrame implements MouseListener,ActionListener
{
	// Create Object
	ImageIcon img;
	JLabel imgLabel;
	JPanel FastP, ImageP, FromP, MainP, LoginP;
	JLabel Heading, Email, Pass;
	JTextField EmailF;
	JPasswordField PassF;
	JButton Loginbt, Singupbt, Back;

    public AdminLogin ()
    {
		//Create Frame
        super("Admin Login");
        setSize(1200, 800);
        setLocation(150, 40);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		//Panel Create
		
		MainP = new JPanel();
		MainP.setLayout(null);
		MainP.setSize(1200,800);
		MainP.setBounds(0,0,1200,800);
		MainP.setBackground(new Color(146, 224, 210));
		add(MainP);
		
		FastP = new JPanel();
		FastP.setLayout(null);
		FastP.setSize(1100,696);
		FastP.setBounds(40,32,1100,696);
		FastP.setBackground(new Color(167,146,211));
		MainP.add(FastP);
		
		ImageP = new JPanel();
		ImageP.setLayout(null);
		ImageP.setSize(600,800);
		ImageP.setBounds(0,0,550,700);
		ImageP.setBackground(Color.WHITE);
		FastP.add(ImageP);
		
		FromP = new JPanel();
		FromP.setLayout(null);
		FromP.setSize(600,800);
		FromP.setBounds(550,0,600,800);
		FromP.setBackground(new Color(236,251,254));
		FastP.add(FromP);
		
		LoginP = new JPanel();
		LoginP.setLayout(null);
		LoginP.setSize(400,300);
		LoginP.setBounds(60,190,400,300);
		LoginP.setBackground(Color.WHITE);
		FromP.add(LoginP);
		
		//Set Border 
		
		Border border = BorderFactory.createLineBorder(new Color(74,116,164), 3);

        LoginP.setBorder(border);

		img = new ImageIcon("Image\\bbbb.jpg");
		imgLabel = new JLabel(img);
		imgLabel.setBounds(0,0,img.getIconWidth(),img.getIconHeight());
		ImageP.add(imgLabel);
		
		//Set Text and Box
		
		Heading = new JLabel("ADMIN LOGIN");
		Heading.setBounds(100,30,200,50);
		Heading.setFont(new Font ("Rubik Bubbles", Font.BOLD,28));
		Heading.setForeground(Color.BLACK);
		LoginP.add(Heading);
		
		Email = new JLabel("Username :");
		Email.setBounds(30,100,100,25);
		Email.setFont(new Font ("Rubik Bubbles", Font.BOLD,14));
		Email.setForeground(Color.BLACK);
		LoginP.add(Email);
		
		EmailF = new JTextField();
		EmailF.setBounds(140,100,210,25);
		LoginP.add(EmailF);
		
		Pass = new JLabel("Password :");
		Pass.setBounds(30,150,100,25);
		Pass.setFont(new Font ("Rubik Bubbles", Font.BOLD,14));
		Pass.setForeground(Color.BLACK);
		LoginP.add(Pass);
		
		PassF = new JPasswordField();
		PassF.setBounds(140,150,210,25);
		LoginP.add(PassF);
		
		//Set Button
		
		Loginbt = new JButton("LOGIN");
		Loginbt.setBounds(60,200,110,25);
		Loginbt.setBackground(new Color(74,116,164));
		Loginbt.setForeground(Color.WHITE);
		Loginbt.addMouseListener(this);
		Loginbt.addActionListener(this);
		LoginP.add(Loginbt);
		
		Singupbt = new JButton("SIGN UP");
		Singupbt.setBounds(200,200,110,25);
		Singupbt.setBackground(new Color(74,116,164));
		Singupbt.setForeground(Color.WHITE);
		Singupbt.addMouseListener(this);
		Singupbt.addActionListener(this);
		LoginP.add(Singupbt);
		
		Back = new JButton("Back..");
		Back.setBounds(400,600,110,25);
		Back.setBackground(new Color(74,116,164));
		Back.setForeground(Color.WHITE);
		Back.addMouseListener(this);
		Back.addActionListener(this);
		FromP.add(Back);
		
		
    }
	
	public void mouseClicked (MouseEvent me) {}
	public void mousePressed (MouseEvent me) {}
	public void mouseReleased (MouseEvent me) {}
	public void mouseEntered (MouseEvent me) 
	{
		if (me.getSource()==Loginbt)
		{
			Loginbt.setBackground(new Color(146, 224, 210));
			Loginbt.setForeground(Color.BLACK);
		}
		else if (me.getSource()==Singupbt)
		{
			Singupbt.setBackground(new Color(146, 224, 210));
			Singupbt.setForeground(Color.BLACK);
		}
		else if (me.getSource()==Back)
		{
			Back.setBackground(new Color(146, 224, 210));
			Back.setForeground(Color.BLACK);
		}
	}
	public void mouseExited (MouseEvent me) 
	{
		if (me.getSource()==Loginbt)
		{
			Loginbt.setBackground(new Color(74,116,164));
			Loginbt.setForeground(Color.WHITE);
		}
		else if (me.getSource()==Singupbt)
		{
			Singupbt.setBackground(new Color(74,116,164));
			Singupbt.setForeground(Color.WHITE);
		}
		else if (me.getSource()==Back)
		{
			Back.setBackground(new Color(74,116,164));
			Back.setForeground(Color.WHITE);
		}
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		if (ae.getSource()==Singupbt)
		{
			AdminSignUp AS1= new AdminSignUp();
		    AS1.setVisible(true);
			this.setVisible(false);
		}
		else if (ae.getSource()==Back)
		{
			Intro I1= new Intro();
		    I1.setVisible(true);
			this.setVisible(false);
		}
		
		
		else if(ae.getSource()==Loginbt)
		{
			String email=EmailF.getText();
			String pass=PassF.getText();
			
			AdminAccount aacc=new AdminAccount();
			
			if(aacc.getAdminAccount(email,pass)==true)
			{
			JOptionPane.showMessageDialog(null,"Valid Account");
		
			AdminHome ahh1=new AdminHome();
			ahh1.loadUserData();
			ahh1.setVisible(true);
			this.setVisible(false);
		   }
		   
		   else{
			   JOptionPane.showMessageDialog(null,"Please Enter a Valid Data");
		   }
		   
		}
	}
}