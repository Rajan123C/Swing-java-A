import javax.swing.*;  
import java.awt.*;  
import java.awt.event.*;  
public class Label extends Frame implements ActionListener{  
    JTextField tf;
    JLabel l; 
    Label(){  
        tf=new JTextField();  
        tf.setBounds(50,50, 150,40);  
        l=new JLabel();  
        l.setBounds(50,100, 350,60);      
        JButton b=new JButton("DVD");  
        b.setBounds(50,150,95,30);  
        b.addActionListener(this);    
        add(b);add(tf);add(l);    
        setSize(400,400);  
        setLayout(null);  
        setVisible(true);  
    }  

    public void actionPerformed(ActionEvent e) {  
        tf.getText();   
        l.setText("Are you serious");  
        l.setBounds(50,100,350,60);
    }  
    public static void main(String[] args) {  
        new Label();  
    } }  