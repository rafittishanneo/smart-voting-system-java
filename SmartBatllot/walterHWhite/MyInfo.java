package walterHWhite;
/* 

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;



public class MyInfo extends JFrame {

    public MyInfo() {
		super("My Information");
		super.setSize(1366, 768); // Set the frame size to 1366x768
        super.setResizable(false);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setLocationRelativeTo(null); // Center the frame on the screen
        setLayout(null);

        // Set the background color
        getContentPane().setBackground(Color.ORANGE);



        JPanel leftHalf = new JPanel();
        leftHalf.setBounds(0, 0, 350, 768);
        leftHalf.setBackground(Color.ORANGE);
        leftHalf.setLayout(null);
        add(leftHalf);











 

  
        
                this.setVisible(true);

    }


}

*/

/* 
import java.awt.Color;
import java.awt.Font;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MyInfo extends JFrame {

    public MyInfo() {
        super("My Information");
        super.setSize(1366, 768);
        super.setResizable(false);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setLocationRelativeTo(null);
        setLayout(null);

        getContentPane().setBackground(Color.ORANGE);

        JPanel leftHalf = new JPanel();
        leftHalf.setBounds(0, 0, 350, 768);
        leftHalf.setBackground(Color.ORANGE);
        leftHalf.setLayout(null);
        add(leftHalf);

        displayUserInfo(leftHalf);

        this.setVisible(true);
    }

    private void displayUserInfo(JPanel panel) {
        JLabel userInfoLabel = new JLabel("User Information");
        userInfoLabel.setBounds(20, 20, 300, 30);
        userInfoLabel.setForeground(Color.BLACK);
        userInfoLabel.setFont(new Font("Candara", Font.BOLD, 18));
        panel.add(userInfoLabel);

        // Read user information from the file
        try (BufferedReader reader = new BufferedReader(new FileReader("user_info.txt"))) {
            String line;
            int yPosition = 60; // Starting Y position for labels

            while ((line = reader.readLine()) != null) {
                JLabel userInfoLine = new JLabel(line);
                userInfoLine.setBounds(20, yPosition, 300, 20);
                userInfoLine.setForeground(Color.BLACK);
                userInfoLine.setFont(new Font("Candara", Font.PLAIN, 14));
                panel.add(userInfoLine);
                yPosition += 20; // Increment Y position for the next label
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new MyInfo();
    }
}
*/


/* 
import javax.swing.*;
import java.awt.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.table.DefaultTableModel;

public class MyInfo extends JFrame {

    private JTable userInfoTable;

    public MyInfo() {
        super("My Information");
        super.setSize(1366, 768);
        super.setResizable(false);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setLocationRelativeTo(null);
        setLayout(null);

        getContentPane().setBackground(Color.ORANGE);

        JPanel leftHalf = new JPanel();
        leftHalf.setBounds(0, 0, 800, 768);
        leftHalf.setBackground(Color.ORANGE);
        leftHalf.setLayout(new BorderLayout());
        add(leftHalf);

        displayUserInfo(leftHalf);

        this.setVisible(true);
    }

    private void displayUserInfo(JPanel panel) {
        // Define column names
        String[] columnNames = {"Field", "Value"};

        // Read user information from the file and populate data array
        String[][] data = readUserData();

        // Create a DefaultTableModel to store data for the JTable
        DefaultTableModel model = new DefaultTableModel(data, columnNames);

        // Create JTable with the DefaultTableModel
        userInfoTable = new JTable(model);
        userInfoTable.setFont(new Font("Candara", Font.PLAIN, 14));

        // Set up JScrollPane to add the JTable to the panel
        JScrollPane scrollPane = new JScrollPane(userInfoTable);
        panel.add(scrollPane, BorderLayout.CENTER);
    }

    private String[][] readUserData() {
        // Read user information from the file and populate data array
        try (BufferedReader reader = new BufferedReader(new FileReader("user_info.txt"))) {
            String line;
            java.util.List<String[]> userDataList = new java.util.ArrayList<>();

            while ((line = reader.readLine()) != null) {
                String[] rowData = line.split(":");
                userDataList.add(rowData);
            }

            // Convert list to a 2D array
            return userDataList.toArray(new String[0][0]);

        } catch (IOException e) {
            e.printStackTrace();
        }

        return new String[0][0];
    }

    public static void main(String[] args) {
        new MyInfo();
    }
}
*/
/* 

import java.awt.Color;
import java.awt.Font;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class MyInfo extends JFrame {

    public MyInfo() {
        super("My Information");
        super.setSize(800, 600); // Adjust size accordingly
        super.setResizable(false);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setLocationRelativeTo(null);
        setLayout(null);

        getContentPane().setBackground(Color.ORANGE);

        JPanel panel = new JPanel();
        panel.setBounds(0, 0, 800, 600); // Adjust size accordingly
        panel.setBackground(Color.ORANGE);
        panel.setLayout(null);
        add(panel);

        displayUserInfo(panel);

        this.setVisible(true);
    }

    private void displayUserInfo(JPanel panel) {
        // Column names for the JTable
        String[] columnNames = { "First Name", "Last Name", "Email", "Username", "Password", "Age", "Gender",
                "Country", "NID", "Postal Code" };

        // Read user information from the file and populate data in a 2D array
        Object[][] data = readUserData();

        // Create a DefaultTableModel with the data and column names
        DefaultTableModel model = new DefaultTableModel(data, columnNames);

        // Create a JTable with the DefaultTableModel
        JTable table = new JTable(model);

        // Set table properties and add it to a JScrollPane
        table.setBounds(20, 20, 750, 500); // Adjust size and position accordingly
        table.setFont(new Font("Candara", Font.PLAIN, 14));

        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBounds(20, 20, 750, 500); // Adjust size and position accordingly
        panel.add(scrollPane);
    }

    private Object[][] readUserData() {
        // Read user information from the file and populate data in a 2D array
        Object[][] data = new Object[0][10];

        try (BufferedReader reader = new BufferedReader(new FileReader("user_info.txt"))) {
            String line;

            while ((line = reader.readLine()) != null) {
                // Split the line by ":" to extract values
                String[] values = line.split(":");

                if (values.length == 2) { // Assuming username and password are saved in the file
                    String[] userInfo = values[1].split(" ");

                    if (userInfo.length == 10) { // Assuming all columns are present
                        Object[] rowData = { userInfo[0], userInfo[1], userInfo[2], userInfo[3],
                                userInfo[4], userInfo[5], userInfo[6], userInfo[7],
                                userInfo[8], userInfo[9] };
                        data = appendRow(data, rowData);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return data;
    }

    private Object[][] appendRow(Object[][] data, Object[] newRow) {
        // Helper method to append a row to a 2D array
        int rowCount = data.length;
        Object[][] newData = new Object[rowCount + 1][10];

        for (int i = 0; i < rowCount; i++) {
            newData[i] = data[i];
        }

        newData[rowCount] = newRow;
        return newData;
    }

    public static void main(String[] args) {
        new MyInfo();
    }
}

*/

/* 

import java.awt.Color;
import java.awt.Font;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class MyInfo extends JFrame {

    public MyInfo() {
        super("My Information");
        super.setSize(1366, 768);
        super.setResizable(false);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setLocationRelativeTo(null);
        setLayout(null);

        getContentPane().setBackground(Color.ORANGE);

        JPanel panel = new JPanel();
        panel.setBounds(0, 0, 1366, 768);
        panel.setBackground(Color.ORANGE);
        panel.setLayout(null);
        add(panel);

        displayUserInfo(panel);

        this.setVisible(true);
    }

    private void displayUserInfo(JPanel panel) {
        // Column names for the JTable
        String[] columnNames = {"First Name", "Last Name", "Email", "Username", "Password", "Age", "Gender",
                                "Country", "NID", "Postal Code"};

        // Read user information from the file and populate data in a 2D array
        Object[][] data = readUserData();

        // Create a DefaultTableModel with the data and column names
        DefaultTableModel model = new DefaultTableModel(data, columnNames);

        // Create a JTable with the DefaultTableModel
        JTable table = new JTable(model);

        // Set table properties and add it to a JScrollPane
        table.setBounds(20, 20, 1326, 600);
        table.setFont(new Font("Candara", Font.PLAIN, 14));

        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBounds(20, 20, 1326, 600);
        panel.add(scrollPane);
    }

    private Object[][] readUserData() {
        // Read user information from the file and populate data in a 2D array
        Object[][] data = new Object[0][10];

        try (BufferedReader reader = new BufferedReader(new FileReader("user_info.txt"))) {
            String line;

            while ((line = reader.readLine()) != null) {
                // Split the line by ":" to extract values
                String[] values = line.split(":");
                
                if (values.length == 2) {  // Assuming username and password are saved in the file
                    String[] userInfo = values[1].split(" ");
                    
                    if (userInfo.length == 10) {  // Assuming all columns are present
                        Object[] rowData = { userInfo[0], userInfo[1], userInfo[2], userInfo[3], 
                                             userInfo[4], userInfo[5], userInfo[6], userInfo[7], 
                                             userInfo[8], userInfo[9] };
                        data = appendRow(data, rowData);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return data;
    }

    private Object[][] appendRow(Object[][] data, Object[] newRow) {
        // Helper method to append a row to a 2D array
        int rowCount = data.length;
        Object[][] newData = new Object[rowCount + 1][10];

        for (int i = 0; i < rowCount; i++) {
            newData[i] = data[i];
        }

        newData[rowCount] = newRow;
        return newData;
    }

    public static void main(String[] args) {
        new MyInfo();
    }
}

*/
/* 

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MyInfo extends JFrame {

    public MyInfo() {
        super("My Information");
        super.setSize(1366, 768);
        super.setResizable(false);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setLocationRelativeTo(null);
        setLayout(null);

        getContentPane().setBackground(Color.ORANGE);

        JPanel panel = new JPanel();
        panel.setBounds(0, 0, 1366, 768);
        panel.setBackground(Color.ORANGE);
        panel.setLayout(null);
        add(panel);

        displayUserInfo(panel);

        this.setVisible(true);
    }

    private void displayUserInfo(JPanel panel) {
        // Column names for the JTable
        String[] columnNames = {"Username", "Password", "First Name", "Last Name", "Email", "Age",
                "NID", "Country", "Gender", "City", "Postal Code"};

        // Read user information from the file and populate data in a 2D array
        Object[][] data = readUserData();

        // Create a DefaultTableModel with the data and column names
        DefaultTableModel model = new DefaultTableModel(data, columnNames);

        // Create a JTable with the DefaultTableModel
        JTable table = new JTable(model);

        // Set table properties and add it to a JScrollPane
        table.setBounds(20, 20, 1326, 600);
        table.setFont(new Font("Candara", Font.PLAIN, 14));

        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBounds(20, 20, 1326, 600);
        panel.add(scrollPane);
    }

    private Object[][] readUserData() {
        // Read user information from the file and populate data in a 2D array
        Object[][] data = new Object[0][11];

        try (BufferedReader reader = new BufferedReader(new FileReader("user_info.txt"))) {
            String line;

            while ((line = reader.readLine()) != null) {
                // Split the line by ":" to extract values
                String[] values = line.split(":");

                if (values.length == 2) {  // Assuming username and password are saved in the file
                    String[] userInfo = values[1].trim().split("\\s+");

                    if (userInfo.length == 11) {  // Assuming all columns are present
                        Object[] rowData = {userInfo[0], userInfo[1], userInfo[2], userInfo[3],
                                userInfo[4], userInfo[5], userInfo[6], userInfo[7],
                                userInfo[8], userInfo[9], userInfo[10]};
                        data = appendRow(data, rowData);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return data;
    }

    private Object[][] appendRow(Object[][] data, Object[] newRow) {
        // Helper method to append a row to a 2D array
        int rowCount = data.length;
        Object[][] newData = new Object[rowCount + 1][11];

        for (int i = 0; i < rowCount; i++) {
            newData[i] = data[i];
        }

        newData[rowCount] = newRow;
        return newData;
    }

    public static void main(String[] args) {
        new MyInfo();
    }
}


*/

/* 
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MyInfo extends JFrame {

    public MyInfo() {
        super("My Information");
        super.setSize(1366, 768);
        super.setResizable(false);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setLocationRelativeTo(null);
        setLayout(null);

        getContentPane().setBackground(Color.ORANGE);

        JPanel panel = new JPanel();
        panel.setBounds(0, 0, 1366, 768);
        panel.setBackground(Color.ORANGE);
        panel.setLayout(null);
        add(panel);

        displayUserInfo(panel);

        this.setVisible(true);
    }

    private void displayUserInfo(JPanel panel) {
        // Column names for the JTable
        String[] columnNames = {"Username", "Password", "First Name", "Last Name", "Email", "Age",
                "NID", "Country", "Gender", "City", "Postal Code"};

        // Read user information from the file and populate data in a 2D array
        Object[][] data = readUserData();

        // Create a DefaultTableModel with the data and column names
        DefaultTableModel model = new DefaultTableModel(data, columnNames);

        // Create a JTable with the DefaultTableModel
        JTable table = new JTable(model);

        // Set table properties and add it to a JScrollPane
        table.setBounds(20, 20, 1326, 600);
        table.setFont(new Font("Candara", Font.PLAIN, 14));

        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBounds(20, 20, 1326, 600);
        panel.add(scrollPane);
    }

    private Object[][] readUserData() {
        // Read user information from the file and populate data in a 2D array
        List<Object[]> userDataList = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader("user_info.txt"))) {
            String line;

            while ((line = reader.readLine()) != null) {
                String[] userInfo = line.split(" ");

                if (userInfo.length == 11) {  // Assuming all columns are present
                    Object[] rowData = {userInfo[0], userInfo[1], userInfo[2], userInfo[3],
                            userInfo[4], userInfo[5], userInfo[6], userInfo[7],
                            userInfo[8], userInfo[9], userInfo[10]};
                    userDataList.add(rowData);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return userDataList.toArray(new Object[0][0]);
    }

    public static void main(String[] args) {
        new MyInfo();
    }
}
*/

import javax.swing.*;
import java.awt.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MyInfo extends JFrame {

    public MyInfo() {
        super("My Information");
        super.setSize(1366, 768);
        super.setResizable(false);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setLocationRelativeTo(null);
        setLayout(new GridLayout(0, 2));

        getContentPane().setBackground(Color.ORANGE);

        displayUserInfo();

        this.setVisible(true);
    }

    private void displayUserInfo() {
        // Read user information from the file and display it using labels
        try (BufferedReader reader = new BufferedReader(new FileReader("user_info.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] userInfo = line.split(" ");
                if (userInfo.length == 11) {
                    for (int i = 0; i < 11; i += 2) {
                        String label = userInfo[i] + ":";
                        String value = userInfo[i + 1];
                        JLabel labelComponent = new JLabel(label, SwingConstants.RIGHT);
                        JLabel valueComponent = new JLabel(value);
                        add(labelComponent);
                        add(valueComponent);
                    }
                    add(new JSeparator(JSeparator.HORIZONTAL));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new MyInfo();
    }
}
