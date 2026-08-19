import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.Border; 

public class Intro extends JFrame implements MouseListener,ActionListener
{
	ImageIcon img;
	JLabel imgLabel; 
	JPanel FastP, ImageP, FromP, MainP, LoginP;
	JLabel Heading, Heading2, HLog;
	JButton Adlog , Uslog, doclog;
	
	public Intro()
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
		MainP.setBackground(new Color(255,209,191));
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
		ImageP.setBackground(new Color(255,232,222));
		FastP.add(ImageP);
		
		FromP = new JPanel();
		FromP.setLayout(null);
		FromP.setSize(600,800);
		FromP.setBounds(550,0,600,800);
		FromP.setBackground(new Color(255,232,222));
		FastP.add(FromP);
		
		LoginP = new JPanel();
		LoginP.setLayout(null);
		LoginP.setSize(400,300);
		LoginP.setBounds(60,190,400,300);
		LoginP.setBackground(new Color(255,209,191));
		FromP.add(LoginP);
	
		//Set Border 
		
		Border border = BorderFactory.createLineBorder(new Color(255,209,191), 3);

        LoginP.setBorder(border);

		img = new ImageIcon("Image/2.jpg");
		imgLabel = new JLabel(img);
		imgLabel.setBounds(0,150,img.getIconWidth(),img.getIconHeight());
		ImageP.add(imgLabel);
		
		Heading = new JLabel("WELLCOME");
		Heading.setBounds(130,60,200,50);
		Heading.setFont(new Font ("Rubik Bubbles", Font.BOLD,28));
		Heading.setForeground(Color.BLACK);
		LoginP.add(Heading);
		
		Heading2 = new JLabel("E-voting");
		Heading2.setBounds(150,90,200,50);
		Heading2.setFont(new Font ("Rubik Bubbles", Font.BOLD,28));
		Heading2.setForeground(Color.BLACK);
		LoginP.add(Heading2);
		
		HLog = new JLabel("How Do You Want To Login ?");
		HLog.setBounds(120,130,400,50);
		HLog.setFont(new Font ("Rubik Bubbles", Font.BOLD,12));
		HLog.setForeground(Color.BLACK);
		LoginP.add(HLog);
		
		
		Adlog = new JButton("Admin Login");//Admin Button
		Adlog.setBounds(80,170,110,25);
		Adlog.setBackground(new Color(235,90,95));
		Adlog.setForeground(Color.WHITE);
		Adlog.addMouseListener(this);
		Adlog.addActionListener(this);
		LoginP.add(Adlog);
		
		Uslog = new JButton("User Login");//User Button
		Uslog.setBounds(200,170,100,25);
		Uslog.setBackground(new Color(235,90,95));
		Uslog.setForeground(Color.WHITE);
		Uslog.addMouseListener(this);
		Uslog.addActionListener(this);
		LoginP.add(Uslog);	
	}
	
	public void mouseClicked (MouseEvent me) {}
	public void mousePressed (MouseEvent me) {}
	public void mouseReleased (MouseEvent me) {}
	public void mouseEntered (MouseEvent me) 
	{
		
		if (me.getSource()==Adlog)  //Admin Login button
		{
			Adlog.setBackground(new Color(255,255,255));
			Adlog.setForeground(Color.BLACK);
		}
		else if (me.getSource()==Uslog)  //User Login button
		{
			Uslog.setBackground(new Color(255,255,255));
			Uslog.setForeground(Color.BLACK);
		}
		else if (me.getSource()==doclog)  //Docotor Login button
		{
			doclog.setBackground(new Color(255,255,255));
			doclog.setForeground(Color.BLACK);
		}	
	}
	public void mouseExited (MouseEvent me) {
		if (me.getSource()==Adlog)  //Admin Login button 
		{
			Adlog.setBackground(new Color(235,90,95));
			Adlog.setForeground(Color.WHITE);
		}
		else if (me.getSource()==Uslog)  //User Login button 
		{
			Uslog.setBackground(new Color(235,90,95));
			Uslog.setForeground(Color.WHITE);
		}
		else if (me.getSource()==doclog)  //Doctor Login button 
		{
			doclog.setBackground(new Color(235,90,95));
			doclog.setForeground(Color.WHITE);
		}
	}

	public void actionPerformed(ActionEvent ae) {
		
		/*if (ae.getSource()==Adlog)   //Admin Login button 
		{
			AdminLogin AL1 = new AdminLogin();
			AL1.setVisible(true);
			this.setVisible(false);
		}
		else if (ae.getSource()==Uslog)   //User Login button 
		{
			UserLogin UL1 = new UserLogin();
			UL1.setVisible(true);
			this.setVisible(false);
		}
		/*else if (ae.getSource()==doclog)   //Doctor Login button 
		{
			DoctorLogin DL1 = new DoctorLogin();
			DL1.setVisible(true);
			this.setVisible(false);
		}*/
	}
	
}