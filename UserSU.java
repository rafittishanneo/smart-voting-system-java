import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;

public class UserSU {
    UserSU(){

        JFrame f1 = new JFrame("Sign Up.");

        JLabel u1 = new JLabel("Welcome To E-VOTE"); 
        u1.setBounds(810,220,400,40);
        u1.setForeground(Color.BLACK);
        u1.setFont(new Font("Candara", Font.BOLD, 36));

        f1.add(u1);

         JLabel uL = new JLabel("Username :"); 
         uL.setBounds(820,300,200,30);
         uL.setForeground(Color.BLACK); // Set font color
         uL.setFont(new Font("Candara", Font.BOLD, 18)); // Set font size
         JTextField t1 = new JTextField();
         t1.setBounds(920,300,200,30);


        JPasswordField p1 = new JPasswordField(); 
        JLabel pL = new JLabel("Password :"); 
        pL.setForeground(Color.BLACK); // Set font color
        pL.setFont(new Font("Candara", Font.BOLD, 18)); // Set font size 
        pL.setBounds(820,360, 180,30);    
        p1.setBounds(920,360,200,30);  


        JButton sButton = new JButton("SignIn");
        sButton.setForeground(Color.WHITE);
        sButton.setBackground(Color.BLACK);
        sButton.setFont(new Font("Candara", Font.BOLD, 20));
        sButton.setBorderPainted(false);
        sButton.setBounds(980,425,150,35);

        JButton s1Button = new JButton("SignUp");
        s1Button.setForeground(Color.WHITE);
        s1Button.setBackground(Color.BLACK);
        s1Button.setFont(new Font("Candara", Font.BOLD, 20));
        s1Button.setBorderPainted(false);
        s1Button.setBounds(810,425,150,35);

        f1.add(s1Button);




        f1.add(p1);
        f1.add(pL);
        f1.add(t1);
        f1.add(uL);
        f1.add(sButton);


        f1.getContentPane().setBackground(Color.ORANGE);




        f1.setSize(1366, 768);
        f1.setResizable(false);
        f1.setLocationRelativeTo(null);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f1.setLayout(null); // Set layout to null for absolute positioning
        f1.setVisible(true);
    }
    
}
