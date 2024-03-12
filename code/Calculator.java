package code;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator extends JFrame implements ActionListener {
    private JTextField numField1, numField2, numField3;
    private JLabel sumLabel, productLabel, averageLabel;
    private JButton calculateButton, clearButton, exitButton;

    public Calculator() {
        setTitle("Calculator");
        setSize(400, 400); // Adjusted size
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(6, 2));

        // Text boxes
        numField1 = new JTextField();
        numField1.setPreferredSize(new Dimension(100, 30)); // Set preferred size for text fields
        numField2 = new JTextField();
        numField2.setPreferredSize(new Dimension(100, 30));
        numField3 = new JTextField();
        numField3.setPreferredSize(new Dimension(100, 30));

        // Labels
        sumLabel = new JLabel("Sum: ");
        sumLabel.setPreferredSize(new Dimension(100, 30)); // Set preferred size for labels
        productLabel = new JLabel("Product: ");
        productLabel.setPreferredSize(new Dimension(100, 30));
        averageLabel = new JLabel("Average: ");
        averageLabel.setPreferredSize(new Dimension(100, 30));

        // Buttons
        calculateButton = new JButton("Calculate");
        calculateButton.setPreferredSize(new Dimension(150, 40)); // Set preferred size for buttons
        clearButton = new JButton("Clear");
        clearButton.setPreferredSize(new Dimension(150, 40));
        exitButton = new JButton("Exit");
        exitButton.setPreferredSize(new Dimension(150, 40));

        // Add action listeners to buttons
        calculateButton.addActionListener(this);
        clearButton.addActionListener(this);
        exitButton.addActionListener(this);

        // Add tooltips to buttons
        calculateButton.setToolTipText("Calculate sum, product, and average");
        clearButton.setToolTipText("Clear all fields");
        exitButton.setToolTipText("Exit the calculator");

        // Add components to the frame
        add(new JLabel("Number 1: "));
        add(numField1);
        add(new JLabel("Number 2: "));
        add(numField2);
        add(new JLabel("Number 3: "));
        add(numField3);
        add(calculateButton);
        add(clearButton);
        add(sumLabel);
        add(productLabel);
        add(averageLabel);
        add(exitButton);
        
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == calculateButton) {
            calculate();
        } else if (e.getSource() == clearButton) {
            clear();
        } else if (e.getSource() == exitButton) {
            System.exit(0);
        }
    }

    private void calculate() {
        try {
            double num1 = Double.parseDouble(numField1.getText());
            double num2 = Double.parseDouble(numField2.getText());
            double num3 = Double.parseDouble(numField3.getText());

            double sum = num1 + num2 + num3;
            double product = num1 * num2 * num3;
            double average = sum / 3;

            sumLabel.setText("Sum: " + sum);
            productLabel.setText("Product: " + product);
            averageLabel.setText("Average: " + average);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Please enter valid numbers in all fields.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void clear() {
        numField1.setText("");
        numField2.setText("");
        numField3.setText("");
        sumLabel.setText("Sum: ");
        productLabel.setText("Product: ");
        averageLabel.setText("Average: ");
numField1.requestFocus();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Calculator());
    }
}