import javax.swing.*;

public class Button extends JFrame {
    Button() {

        JTextField tf = new JTextField();
        JButton b = new JButton(new ImageIcon("t.png")); 

        tf.setBounds(50, 50, 150, 20);
        b.setBounds(50, 100, 95, 30);

        add(tf);
        add(b);

        setSize(400, 400);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Button();
    }
}
