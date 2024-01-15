
import javax.swing.*;


public class Table extends JFrame {
    Table() {    
        JTable t = new JTable();    
        t.setBounds(50, 120, 100, 90);     

        String data[][] = { 
            {"001", "Rohit", "67%"},    
            {"002", "Ravi", "78%"},    
            {"003", "Raju", "70%"},
            {"004","Rahul","99%"}
        };    
        
        String column[] = {"STUDENT ID", "STUDENT NAME", "STUDENT MARKS"};

        JScrollPane sp = new JScrollPane(t);    
        t.setModel(new javax.swing.table.DefaultTableModel(data, column));
   
        add(t);       
        setSize(1000, 1000);    
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Table();
    }
}
