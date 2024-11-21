import javax.swing.*;
import java.awt.event.*;
public class Swing_login {
    public static void main(String args[]){
        /*JFrame jf=new JFrame();
        jf.setSize(500,500);
    
        
        JTextField jt=new JTextField("loginform");
        jt.setBounds(500,250,50,50);
        JTextField jt1=new JTextField("username");
        jt1.setBounds(100,50,100,50);
        
        JTextField jl=new JTextField(" ");
        jl.setBounds(100,50,50,50);
        JTextField jt2=new JTextField("password");
        jt2.setBounds(300,50,50,50);
        JTextField jl1=new JTextField(" ");
        jl1.setBounds(300,50,50,50);
        JButton jb=new JButton("login");
        jb.setBounds(350,50,50,60);
        jb.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
               // String n=jt.getText();
               // jt.setText("login form"+n);
              //String n1=jt1.getText();
                //jt1.setText("login form"+n1);
                //String n2=jt2.getText();
                //jt2.setText("login form"+n2);
                String n3=jl.getText();
                jl.setText(n3);
                String n4=jl1.getText();
                jl1.setText(n4);
               // String n5=jb.getText();
                //jb.setText("login form"+n5);
            }
        });
        jf.add(jt);
        jf.add(jt1);
        jf.add(jt2);
        jf.add(jl);
        jf.add(jl1);
        jf.add(jb);
        jf.setLayout(null);
        jf.setVisible(true);
    }
}*/
/*import javax.swing.*;
import java.awt.*;
public class Swing_login  {
    public static void main(String[] args) {
        // Create the main frame
        JFrame frame = new JFrame("Login Form");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 150);
        frame.setLayout(new BorderLayout());

        // Create a panel for the username field
        JPanel usernamePanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        JLabel usernameLabel = new JLabel("Username: ");
        JTextField usernameField = new JTextField(20);
        usernamePanel.add(usernameLabel);
        usernamePanel.add(usernameField);

        // Create a panel for the password field
        JPanel passwordPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        JLabel passwordLabel = new JLabel("Password: ");
        JPasswordField passwordField = new JPasswordField(20);
        passwordPanel.add(passwordLabel);
        passwordPanel.add(passwordField);

        // Create a panel for the login button
        JPanel loginPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JButton loginButton = new JButton("Login");
        loginPanel.add(loginButton);

        // Add the panels to the main frame
        frame.add(usernamePanel, BorderLayout.NORTH);
        frame.add(passwordPanel, BorderLayout.CENTER);
        frame.add(loginPanel, BorderLayout.SOUTH);

        // Display the frame
        frame.setVisible(true);*/


        JFrame f=new JFrame("login Form");
        f.setSize(500,500);
        JLabel l1=new JLabel("user name");
        l1.setBounds(100,100,100,30);
        JLabel l2=new JLabel("password");
        l2.setBounds(100,180,100,30);
        JTextArea t1=new JTextArea();
        t1.setBounds(250,100,100,30);
        JPasswordField p1=new JPasswordField();
        p1.setBounds(250,180,100,30);
        JButton b=new JButton("click here");
        b.setBounds(200,250,100,50);
        JLabel l3=new JLabel();
        l3.setBounds(250,350,200,20);
        b.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String n=l3.getText();
                l3.setText("U Loggedin successfully");
            }
        });
        

        f.add(l1);
        f.add(l2);
        f.add(t1);
        f.add(p1);
        f.add(b);
        f.add(l3);
        f.setLayout(null);
        f.setVisible(true);
    }
}
