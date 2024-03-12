package code;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Calculator extends JFrame implements ActionListener{
    private JTextField[] textFields;
    private JLabel[] labels;
    private JButton calculateButton, clearButton, exitButton;

    public Calculator(){
        setTitle("Window Calculator");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 2));
        
        textFields = new JTextField[3];
        labels = new JLabel[3];
    }
}
