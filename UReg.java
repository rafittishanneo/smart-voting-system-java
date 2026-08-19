import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;

public class UReg {
    UReg() {
        JFrame f1 = new JFrame("Create an account.");

        JLabel r1 = new JLabel("Create An Account"); 
        r1.setBounds(670,130,400,40);
        r1.setForeground(Color.BLACK);
        r1.setFont(new Font("Candara", Font.BOLD, 36));

        f1.add(r1);

        JLabel u1 = new JLabel("Firstname :"); 
        u1.setBounds(670,200,200,30);
        u1.setForeground(Color.BLACK); // Set font color
        u1.setFont(new Font("Candara", Font.BOLD, 18)); // Set font size
        JTextField t1 = new JTextField();
        t1.setBounds(670, 225, 200, 30);

        JLabel u2 = new JLabel("Lastname :"); 
        u2.setBounds(1000,200,200,30);
        u2.setForeground(Color.BLACK); // Set font color
        u2.setFont(new Font("Candara", Font.BOLD, 18)); // Set font size
        JTextField t2= new JTextField();
        t2.setBounds(1000, 225, 200, 30);

        JLabel u3 = new JLabel("E-mail :"); 
        u3.setBounds(670,265,200,30);
        u3.setForeground(Color.BLACK); // Set font color
        u3.setFont(new Font("Candara", Font.BOLD, 18)); // Set font size
        JTextField t3 = new JTextField();
        t3.setBounds(670, 290, 200, 30);


        JLabel u4 = new JLabel("Country :"); 
        u4.setBounds(1000,265,200,30);
        u4.setForeground(Color.BLACK); // Set font color
        u4.setFont(new Font("Candara", Font.BOLD, 18)); // Set font size
        JTextField t4= new JTextField();
        t4.setBounds(1000, 290, 200, 30);

        JLabel u5 = new JLabel("New Password :"); 
        u5.setBounds(670,330,200,30);
        u5.setForeground(Color.BLACK); // Set font color
        u5.setFont(new Font("Candara", Font.BOLD, 18)); // Set font size
        JTextField t5 = new JTextField();
        t5.setBounds(670, 355, 200, 30);
        
        JLabel u6 = new JLabel("Confirm Password :"); 
        u6.setBounds(1000,330,200,30);
        u6.setForeground(Color.BLACK); // Set font color
        u6.setFont(new Font("Candara", Font.BOLD, 18)); // Set font size
        JTextField t6= new JTextField();
        t6.setBounds(1000, 355, 200, 30);


        JButton r1Button = new JButton("Create an account");
        r1Button.setForeground(Color.WHITE);
        r1Button.setBackground(Color.BLACK);
        r1Button.setFont(new Font("Candara", Font.BOLD, 20));
        r1Button.setBorderPainted(false);
        r1Button.setBounds(670,425,280,40);

        f1.add(r1Button);




        f1.add(u1);
        f1.add(t1);
        f1.add(u2);
        f1.add(t2);
        f1.add(u3);
        f1.add(t3);
        f1.add(u4);
        f1.add(t4);
        f1.add(u5);
        f1.add(t5);
        f1.add(u6);
        f1.add(t6);


    








        f1.getContentPane().setBackground(Color.ORANGE);




        f1.setSize(1366, 768);
        f1.setResizable(false);
        f1.setLocationRelativeTo(null);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f1.setLayout(null); // Set layout to null for absolute positioning
        f1.setVisible(true);
    }
    
}
