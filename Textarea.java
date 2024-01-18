import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Textarea extends JFrame implements ActionListener {
    JTextField a;
    JPasswordField p;

    Textarea() {
        JLabel l1 = new JLabel("LOGIN");
        JLabel l2 = new JLabel("User Name");
        JLabel l3 = new JLabel("Password");

        a = new JTextField();
        p = new JPasswordField();

        JButton b = new JButton("Login");
        b.addActionListener(this);

        l1.setBounds(290, 50, 100, 30);
        l2.setBounds(230, 100, 200, 30);
        l3.setBounds(230, 160, 250, 30);
        a.setBounds(230, 130, 200, 30);
        p.setBounds(230, 190, 200, 30);
        b.setBounds(250, 230, 150, 40);

        add(a);
        add(p);
        add(l1);
        add(l2);
        add(l3);
        add(b);

        setSize(1000, 1000);  
        setTitle("Welcome worlds");
        setLayout(null);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent event) {
        String t1 = a.getText();
        String t2 = new String(p.getPassword()); 

        JLabel l4 = new JLabel("Username: " + t1 + " Password: " + t2);
        l4.setBounds(350, 500, 400, 50);  
        add(l4);
    }

    public static void main(String[] args) {
        new Textarea();
    }
}
