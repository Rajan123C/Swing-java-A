import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class Call extends JFrame {
    JButton btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn10,btn11,btn12,btn13,btn14,btn15,btn16;
    Call(){
        JTextField txt = new JTextField();
        btn1 = new JButton("9");
        btn2 = new JButton("6");
        btn3 = new JButton("3");
        btn4 = new JButton("8");
        btn5 = new JButton("5");
        btn6 = new JButton("2");
        btn7 = new JButton("7");
        btn8 = new JButton("4");
        btn9 = new JButton("1");
        btn10 = new JButton("*");
        btn11 = new JButton("-");
        btn12 = new JButton("+");
        btn13 = new JButton("/");
        btn14 = new JButton("0");
        btn15 = new JButton("=");
        btn16 = new JButton("clear");
        txt.setBounds(10, 10, 290, 30);
        btn1.setBounds(10, 50, 50, 50);
        btn2.setBounds(10, 110, 50, 50);
        btn3.setBounds(10, 170, 50, 50);
        btn4.setBounds(70,50 , 50, 50);
        btn5.setBounds(70, 110, 50, 50);
        btn6.setBounds(70, 170, 50, 50);
        btn7.setBounds(130, 50, 50, 50);
        btn8.setBounds(130, 110, 50, 50);
        btn9.setBounds(130, 170, 50, 50);
        btn10.setBounds(190, 50, 50, 50);
        btn11.setBounds(190, 110, 50, 50);
        btn12.setBounds(190, 170, 50, 50);
        btn13.setBounds(250, 50, 50, 50);
        btn14.setBounds(250, 110, 50, 50);
        btn15.setBounds(250, 170, 50, 50);
        btn16.setBounds(10, 230, 290, 50);
        add(txt);
        add(btn1);
        add(btn2);
        add(btn3);
        add(btn4);
        add(btn5);
        add(btn6);
        add(btn7);
        add(btn8);
        add(btn9);
        add(btn10);
        add(btn11);
        add(btn12);
        add(btn13);
        add(btn14);
        add(btn15);
        add(btn16);

        setSize(330 ,330);
        setLayout(null);  
        setVisible(true); 

        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txt.setText("9");
    

                }
        
        });
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txt.setText("6");
    

                }
        
        });

     
        
    }
    public static void main(String[] args) {
        new Call();

    }
}