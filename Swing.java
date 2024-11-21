import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Swing {
    public static void main(String args[]){
        /*JFrame j=new JFrame();
        j.setSize(500,500);
        JButton b=new JButton("click");
        b.setBounds(130,100,100,40);
        //JTextField t=new JTextField();
        JLabel jl=new JLabel();
        jl.setBounds(50,50,150,20);
          b.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String n=jl.getText();
                jl.setText("welcome to java Swings concept");
          }
          });
          j.add(jl);
          j.add(b);
          j.setLayout(null);
        j.setVisible(true);*/

        JFrame jf=new JFrame();
        jf.setSize(500,500);
         JButton jb=new JButton("click");
        jb.setBounds(100,50,125,85);
        JTextField jt=new JTextField();
        jt.setBounds(100,50,120,35);
        JLabel jl=new JLabel();
        jl.setBounds(200,200,150,40);
       
        jb.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String n=jt.getText();
                String n1=jl.getText();
                jt.setText("Hello Eshuuu"+n);
                jl.setText("what happened"+n1);
            }
        });
        jf.add(jb);
        jf.add(jt);
        jf.add(jl);
        jf.setLayout(null);
        jf.setVisible(true);
    }
}
