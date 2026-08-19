package GUI;
import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.Border;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import Entity.*;

//import data.*;
//import Image.*;

public class AdminSignUp extends JFrame implements MouseListener,ActionListener
{
    // Create Object
	ImageIcon img;
	JLabel imgLabel;
	JPanel FastP, ImageP, FromP, MainP, LoginP;
	JLabel Heading, name, phone , pass , gender, Acc;
	JTextField nameF, phoneF;
	JPasswordField passF;
	JRadioButton male, female;
	JButton SingUP, Login , See;
	ButtonGroup Gn;
	JCheckBox Agree;
	JButton Signupbt , Loginbt;

	
	public AdminSignUp()
	{
		//Create Frame
        super("Login");
        setSize(1200, 800);
        setLocation(150, 40);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		//Panel Create
		MainP = new JPanel();
		MainP.setLayout(null);
		MainP.setSize(1200,800);
		MainP.setBounds(0,0,1200,800);
		MainP.setBackground(new Color(106,158,234));
		add(MainP);
		
		FastP = new JPanel();
		FastP.setLayout(null);
		FastP.setSize(1100,700);
		FastP.setBounds(40,30,1100,700);
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
		FromP.setBackground(new Color(255,255,255));
		FastP.add(FromP);
		
		LoginP = new JPanel();
		LoginP.setLayout(null);
		LoginP.setSize(400,500);
		LoginP.setBounds(70,110,400,500);
		LoginP.setBackground(Color.WHITE);
		FromP.add(LoginP);
		
		//Set Border 
		
		Border border = BorderFactory.createLineBorder(new Color(106,158,234), 3);

        LoginP.setBorder(border);

		img = new ImageIcon("Image\\bbbb.jpg");
		imgLabel = new JLabel(img);
		imgLabel.setBounds(0,0,img.getIconWidth(),img.getIconHeight());
		ImageP.add(imgLabel);
		
		//Set Text and Box
		
		Heading = new JLabel("SIGNUP");
		Heading.setBounds(150,30,200,50);
		Heading.setFont(new Font ("Rubik Bubbles", Font.BOLD,28));
		Heading.setForeground(Color.BLACK);
		LoginP.add(Heading);
		
		name = new JLabel("Username :");
		name.setBounds(30,100,100,25);
		name.setFont(new Font ("Rubik Bubbles", Font.BOLD,14));
		name.setForeground(Color.BLACK);
		LoginP.add(name);
		
		nameF = new JTextField();
		nameF.setBounds(140,100,210,25);
		LoginP.add(nameF);
		
		phone = new JLabel("Contact :");
		phone.setBounds(30,150,100,25);
		phone.setFont(new Font ("Rubik Bubbles", Font.BOLD,14));
		phone.setForeground(Color.BLACK);
		LoginP.add(phone);
		
		phoneF = new JTextField();
		phoneF.setBounds(140,150,210,25);
		LoginP.add(phoneF);
		
		pass = new JLabel("Password :");
		pass.setBounds(30,200,100,25);
		pass.setFont(new Font ("Rubik Bubbles", Font.BOLD,14));
		pass.setForeground(Color.BLACK);
		LoginP.add(pass);
		
		passF = new JPasswordField();
		passF.setBounds(140,200,210,25);
		LoginP.add(passF);
		
		gender = new JLabel("Gender :");
		gender.setBounds(30,250,100,25);
		gender.setFont(new Font ("Rubik Bubbles", Font.BOLD,14));
		gender.setForeground(Color.BLACK);
		LoginP.add(gender);
		
		Gn = new ButtonGroup();
		
		male =  new JRadioButton ("Male ");
		male.setBounds(140, 250, 100, 25);
		male.setBackground(Color.WHITE);
		LoginP.add(male);
		
		female =  new JRadioButton ("Female ");
		female.setBounds(240, 250, 100, 25);
		female.setBackground(Color.WHITE);
		LoginP.add(female);
		
		Gn.add(male);
		Gn.add(female);
		
		Signupbt = new JButton("Sign Up");
		Signupbt.setBounds(60,350,300,25);
		Signupbt.setBackground(new Color(74,116,164));
		Signupbt.setForeground(Color.WHITE);
		Signupbt.addMouseListener(this);
		Signupbt.addActionListener(this);
		LoginP.add(Signupbt);
		
		Acc = new JLabel("I have already a Account ");
		Acc.setBounds(150, 380, 200, 25);
		LoginP.add(Acc);
		
		Loginbt = new JButton("Login");
		Loginbt.setBounds(60,410,300,25);
		Loginbt.setBackground(new Color(74,116,164));
		Loginbt.setForeground(Color.WHITE);
		Loginbt.addMouseListener(this);
		Loginbt.addActionListener(this);
		LoginP.add(Loginbt);
		

	}	
	
	//Mouse Work 
	public void mouseClicked (MouseEvent me) {}
	public void mousePressed (MouseEvent me) {}
	public void mouseReleased (MouseEvent me) {}
	public void mouseEntered (MouseEvent me) 
	{
		if (me.getSource()==Signupbt)
		{
			Signupbt.setBackground(new Color(146, 224, 210));
			Signupbt.setForeground(Color.BLACK);
		}
		else if (me.getSource()==Loginbt)
		{
			Loginbt.setBackground(new Color(146, 224, 210));
			Loginbt.setForeground(Color.BLACK);
		}
	}
	public void mouseExited (MouseEvent me) 
	{
		if (me.getSource()==Signupbt)
		{
			Signupbt.setBackground(new Color(74,116,164));
			Signupbt.setForeground(Color.WHITE);
		}
		else if (me.getSource()==Loginbt)
		{
			Loginbt.setBackground(new Color(74,116,164));
			Loginbt.setForeground(Color.WHITE);
		}
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==Signupbt)
		{
			
			String name=nameF.getText();
			String pass=passF.getText();
			String phone=phoneF.getText();
			
			if(name.isEmpty()||pass.isEmpty()||phone.isEmpty())
			{
				JOptionPane.showMessageDialog(null,"Fill All");
			}
			else
			{
				AdminAccount aacc=new AdminAccount(name,pass,phone);
				aacc.addAdminAccount();
				
				JOptionPane.showMessageDialog(null,"SucessFully Register");
				
				nameF.setText("");
				passF.setText("");
				
				AdminLogin L1 = new AdminLogin();
				L1.setVisible(true);
				this.setVisible(false);
				
			}
		}
		else if (ae.getSource()==Loginbt)
		{
			AdminLogin AL1 = new AdminLogin();
		    AL1.setVisible(true);
			this.setVisible(false);
		}
	}
}