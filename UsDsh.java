import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JPanel;

public class UsDsh {
    UsDsh() {
    
        JFrame f1 = new JFrame("User Dashboard.");
    

        JLabel d1 = new JLabel("< Smart-Ballot >"); 
        d1.setBounds(220,500,180,26);
        d1.setForeground(Color.BLACK); // Set font color
        d1.setFont(new Font("Candara", Font.BOLD, 30)); // Set font size

        JPanel leftHalf = new JPanel();
        leftHalf.setBounds(0,0, 350, 768); // Adjust the bounds as needed
        leftHalf.setBackground(Color.ORANGE);



        JButton userButton = new JButton("User");
        userButton.setForeground(Color.WHITE);
        userButton.setBackground(Color.BLACK);
        userButton.setFont(new Font("Candara", Font.BOLD, 20));
        userButton.setBorderPainted(false);
        userButton.setBounds(525, 380, 150, 40);
        












        leftHalf.add(d1);
        f1.add(leftHalf);






    f1.setSize(1366, 768);
    f1.setResizable(false);
    f1.setLocationRelativeTo(null);
    f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f1.setLayout(null); // Set layout to null for absolute positioning
    f1.setVisible(true);


  }

    
}
