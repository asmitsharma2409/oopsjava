import javax.swing.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class WindowBuilder implements ActionListener {
    
    private static JTextArea Namef, BrachF;
    private static JTextField passwordfield;
    
    public static void main(String[] args) {
        JFrame frame = new JFrame("My Awesome Window");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(807, 435);
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.decode("#f4c064"));

        JButton login = new JButton("Login");
        login.setBounds(289, 354, 106, 30);
        login.setBackground(Color.decode("#bca8e4"));
        login.setForeground(Color.decode("#000"));
        login.setFont(new Font("SansSerif", Font.PLAIN, 14));
        panel.add(login);

        JButton reset = new JButton("Reset");
        reset.setBounds(465, 350, 106, 30);
        reset.setBackground(Color.decode("#bca8e4"));
        reset.setForeground(Color.decode("#000"));
        reset.setFont(new Font("SansSerif", Font.PLAIN, 14));
        panel.add(reset);

        JLabel NameL = new JLabel("Name");
        NameL.setBounds(291, 71, 108, 35);
        NameL.setFont(new Font("SansSerif", Font.PLAIN, 23));
        NameL.setForeground(Color.decode("#000"));
        panel.add(NameL);

        Namef = new JTextArea("");
        Namef.setBounds(401, 61, 106, 46);
        Namef.setFont(new Font("SansSerif", Font.PLAIN, 14));
        Namef.setBackground(Color.decode("#ffe7bf"));
        Namef.setForeground(Color.decode("#73664e"));
        panel.add(Namef);

        JLabel BranchL = new JLabel("Branch");
        BranchL.setBounds(293, 184, 106, 32);
        BranchL.setFont(new Font("SansSerif", Font.PLAIN, 23));
        BranchL.setForeground(Color.decode("#000"));
        panel.add(BranchL);

        BrachF = new JTextArea("");
        BrachF.setBounds(403, 179, 106, 46);
        BrachF.setFont(new Font("SansSerif", Font.PLAIN, 14));
        BrachF.setBackground(Color.decode("#ffe7bf"));
        BrachF.setForeground(Color.decode("#73664e"));
        panel.add(BrachF);

        JLabel PasswordL = new JLabel("Password");
        PasswordL.setBounds(289, 273, 114, 43);
        PasswordL.setFont(new Font("SansSerif", Font.PLAIN, 23));
        PasswordL.setForeground(Color.decode("#000"));
        panel.add(PasswordL);

        passwordfield = new JTextField("");
        passwordfield.setBounds(407, 277, 106, 24);
        passwordfield.setFont(new Font("SansSerif", Font.PLAIN, 14));
        passwordfield.setBackground(Color.decode("#ffe7bf"));
        passwordfield.setForeground(Color.decode("#73664e"));
        panel.add(passwordfield);

        frame.add(panel);
        frame.setVisible(true);

        WindowBuilder builder = new WindowBuilder();
        login.addActionListener(builder);
        reset.addActionListener(builder);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();

        if (command.equals("Login")) {
            String name = Namef.getText();
            String branch = BrachF.getText();
            String password = passwordfield.getText();

            if (!name.isEmpty() && !branch.isEmpty() && !password.isEmpty()) {
                DataBaseManager dbManager = new DataBaseManager();
                dbManager.insertStudent(name, branch, password);
                JOptionPane.showMessageDialog(null, "Login Successful!\nName: " + name + "\nBranch: " + branch);
            } else {
                JOptionPane.showMessageDialog(null, "Please fill all fields", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }

        if (command.equals("Reset")) {
            Namef.setText("");
            BrachF.setText("");
            passwordfield.setText("");
        }
    }

    public static class DataBaseManager {
        private final String driver = "com.mysql.cj.jdbc.Driver";
        private final String url = "jdbc:mysql://localhost:3306/WB";  // Update with your database name
        private final String user = "root";
        private final String password = "Abhinav258963";
        
        public void insertStudent(String name, String branch, String password) {
            Connection con = null;
            PreparedStatement pstmt = null;
    
            try {
                Class.forName(driver);
                con = DriverManager.getConnection(url, user, this.password);
                
                // Updated SQL query for 'student4' table
                String sqlInsert = "INSERT INTO student4 (sname, sbranch, password) VALUES (name, branch, password)";
                pstmt = con.prepareStatement(sqlInsert);
                pstmt.setString(1, name);
                pstmt.setString(2, branch);
                pstmt.setString(3, password);
                pstmt.executeUpdate();
    
            } catch (ClassNotFoundException | SQLException ex) {
                ex.printStackTrace();
            } finally {
                try {
                    if (pstmt != null) pstmt.close();
                    if (con != null) con.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        }
    }
}

    
