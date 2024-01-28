import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class Calculator2 extends JFrame {
    JTextField txt;
    JButton btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn10,btn11,btn12,btn13,btn14,btn15,btn16,btn17,btn18;
    String backSpace,op;
    Integer first,secound,r;

    Calculator2(){
        txt = new JTextField();
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
        btn18 = new JButton("%");
        btn16 = new JButton("clear");
        btn17 = new JButton("\uF0E7");
        
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
        btn16.setBounds(10, 230, 160, 50);
        btn17.setBounds(250,230,50,50);
        btn18.setBounds(190,230,50,50);

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
        add(btn17);
        add(btn18);

        setSize(330 ,330);
        setLayout(null);  
        setVisible(true); 

        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String g1 = txt.getText()+btn1.getText();
                 txt.setText(g1);

                }
        
        });
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String g1 = txt.getText()+btn2.getText();
                 txt.setText(g1);

                }
        
        });

        btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String g1 = txt.getText()+btn3.getText();
                 txt.setText(g1);                      

                }
        
        });
        btn4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String g1 = txt.getText()+btn4.getText();
                 txt.setText(g1);                
    

                }
        
        });
        btn5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String g1 = txt.getText()+btn5.getText();
                 txt.setText(g1);                
    

                }
        
        });

        btn6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String g1 = txt.getText()+btn6.getText();
                 txt.setText(g1);                
    

                }
        
        });
        btn7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String g1 = txt.getText()+btn7.getText();
                 txt.setText(g1);                
    

                }
        
        });
        btn8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String g1 = txt.getText()+btn8.getText();
                 txt.setText(g1);                
    

                }
        
        });
        btn9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String g1 = txt.getText()+btn9.getText();
                 txt.setText(g1);                
    

                }
        
        });
        btn10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               
                first =Integer.parseInt(txt.getText());
                txt.setText("");           
                op = "*";

    

                }
        
        });
        btn11.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                first =Integer.parseInt(txt.getText());
                txt.setText("");           
                op = "-";
    

                }
        
        });
        btn12.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                first =Integer.parseInt(txt.getText());
                txt.setText("");           
                op = "+";
                }
        
        });
        btn13.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                               
                first =Integer.parseInt(txt.getText());
                txt.setText("");           
                op = "/";

                }
        
        });
        btn14.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String g1 = txt.getText()+btn14.getText();
                txt.setText(g1);    
               

                }
        
        });
        btn15.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String ans;
                secound = Integer.parseInt(txt.getText());
                if (op=="+") {
                    r=first+secound;
                    ans = r.toString();
                    txt.setText(ans);
                }
                else if (op=="-") {
                    r=first-secound;
                    ans = r.toString();
                    txt.setText(ans);
                }
                else if (op=="*") {
                    r=first*secound;
                    ans = r.toString();
                    txt.setText(ans);
                }
                else if (op=="/") {
                    r=first/secound;
                    ans = r.toString();
                    txt.setText(ans);
                }
                else if (op=="%") {
                    r=first%secound;
                    ans = r.toString();
                    txt.setText(ans);
                }
            }
        
         });

         btn16.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 txt.setText("");
                 first = null;
                 secound = null;
                 r = null;
    
             }
        });
        btn17.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                backSpace = txt.getText();
                if (backSpace.length() > 0) {
                    txt.setText(backSpace.substring(0, backSpace.length() - 1));
                }
            }
        });
        btn18.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                first =Integer.parseInt(txt.getText());
                txt.setText("");           
                op = "%";
            }
        });
     
        
    }
    public static void main(String[] args) {
        new Calculator2();

    }
}