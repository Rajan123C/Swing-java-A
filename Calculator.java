import javax.swing.*;

public class Calculator extends JFrame {
    
    Calculator(){
        JTextField t = new JTextField();
        t.setBounds(30,60,291,40);

        JButton b1 = new JButton("9");
        b1.setBounds(30,100,50,30);

        JButton b2 = new JButton("6");
        b2.setBounds(30,140,50,30);

        JButton b3 = new JButton("3");
        b3.setBounds(30,180,50,30);

        JButton b4 = new JButton("8");
        b4.setBounds(90,100,50,30);

        JButton b5 = new JButton("5");
        b5.setBounds(90,140,50,30);

        JButton b6 = new JButton("2");
        b6.setBounds(90,180,50,30);

        JButton b7 = new JButton("7");
        b7.setBounds(150,100,50,30);

        JButton b8 = new JButton("4");
        b8.setBounds(150,140,50,30);

        JButton b9 = new JButton("1");
        b9.setBounds(150,180,50,30);

        JButton b10 = new JButton("=");
        b10.setBounds(210,100,50,30);

        JButton b11 = new JButton("0");
        b11.setBounds(210,140,50,30);

        JButton b12 = new JButton("+");
        b12.setBounds(210,180,50,30);

        JButton b13 = new JButton("-");
        b13.setBounds(270,100,50,30);

        JButton b14 = new JButton("*");
        b14.setBounds(270,140,50,30);

        JButton b15 = new JButton("/");
        b15.setBounds(270,180,50,30);

        JButton b16 = new JButton("Clear");
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