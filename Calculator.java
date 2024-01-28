import javax.swing.*;

public class Calculator extends JFrame {
    
    Calculator(){
      
        JTextField t = new JTextField();
        JButton b1 = new JButton("9");
        JButton b2 = new JButton("6");
        JButton b3 = new JButton("3");
        JButton b4 = new JButton("8");
        JButton b5 = new JButton("5");
        JButton b6 = new JButton("2");
        JButton b7 = new JButton("7");
        JButton b8 = new JButton("4");
        JButton b9 = new JButton("1");
        JButton b10 = new JButton("=");
        JButton b11 = new JButton("0");
        JButton b12 = new JButton("+");
        JButton b13 = new JButton("-");
        JButton b14 = new JButton("*");
        JButton b15 = new JButton("/");
        JButton b16 = new JButton("Clear");
        
        t.setBounds(30,60,291,40);
        b1.setBounds(30,100,50,30);
        b2.setBounds(30,140,50,30);
        b3.setBounds(30,180,50,30);
        b4.setBounds(90,100,50,30);
        b5.setBounds(90,140,50,30);
        b6.setBounds(90,180,50,30);
        b7.setBounds(150,100,50,30);
        b8.setBounds(150,140,50,30);
        b9.setBounds(150,180,50,30);
        b10.setBounds(210,100,50,30);
        b11.setBounds(210,140,50,30);
        b12.setBounds(210,180,50,30);
        b13.setBounds(270,100,50,30);
        b14.setBounds(270,140,50,30);
        b15.setBounds(270,180,50,30);
        b16.setBounds(30,27,50,30);
        
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(b6);
        add(b7);
        add(b8);
        add(b9);
        add(b10);
        add(b11);
        add(b12);
        add(b13);
        add(b14);
        add(b15);
      add(b16);
      add(t);
        
      setSize(400,400);
      setLayout(null);
      setVisible(true);
    }
    
    public static void main(String[] args) { 
       new Calculator();
    }
}