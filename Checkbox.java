import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Checkbox extends JFrame {
    Checkbox(){
        JLabel l = new JLabel("Qno.1 What Do you Choose ?");
        JCheckBox c1 = new JCheckBox("HTML with CSS");
        JCheckBox c2 = new JCheckBox("C with C++");
        JCheckBox c3 = new JCheckBox("Core Java wirh Advance");
        JButton b = new JButton("Submit");



        l.setBounds(100, 90, 150, 40);
        c1.setBounds(120, 120, 120, 40);
        c2.setBounds(120, 150, 120, 40);
        c3.setBounds(120, 180, 120, 40);
        b.setBounds(130, 220, 90, 30);

        add(l);
        add(c1);
        add(c2);
        add(c3);
        add(b);

        setTitle("Let Me See");
        setSize(500,500);
        setLayout(null);
        setVisible(true);
    }

  public static void main(String[] args) {
    new Checkbox();
  }
}