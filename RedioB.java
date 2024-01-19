import javax.swing.*;    
import java.awt.event.*;    

class RedioB extends JFrame implements ActionListener{   

JRadioButton rb1,rb2;    
JButton b1;    

RedioB(){      
rb1=new JRadioButton("Male");    
rb2=new JRadioButton("Female");
ButtonGroup b=new ButtonGroup();    
b1=new JButton("click");    

rb1.setBounds(100,50,100,30);      
rb2.setBounds(100,100,100,30);  
b1.setBounds(100,150,80,30); 

b.add(rb1);
b.add(rb2);    
add(rb1);
add(rb2);
add(b1);    

b1.addActionListener(this);    
setSize(300,300);    
setLayout(null);    
setVisible(true);    
}

public void actionPerformed(ActionEvent e){  

if(rb1.isSelected()){    
JOptionPane.showMessageDialog(this,"You are Male.");    
}    

if(rb2.isSelected()){    
JOptionPane.showMessageDialog(this,"You are Female.");    
}    
}    

public static void main(String args[]){    
   new RedioB();    
}}   
