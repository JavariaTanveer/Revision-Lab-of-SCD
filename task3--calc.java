import java.awt.*;
import java.awt.FlowLayout;
import java.awt.event.*;
import javax.swing.*;

public class Calculator extends JFrame {
    private JLabel num1Label, num2Label, operatorLabel, resultLabel;
    private JTextField num1Field, num2Field;
    private JComboBox<String> operatorBox;
    private JButton calculateButton;

    public Calculator() {
      
        super("Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        num1Label = new JLabel("Number 1:");
        add(num1Label);
        num1Field = new JTextField(10);
        add(num1Field);

        num2Label = new JLabel("Number 2:");
        add(num2Label);
        num2Field = new JTextField(10);
        add(num2Field);

       
        operatorLabel = new JLabel("Operator:");
        add(operatorLabel);
        String[] operators = {"+", "-", "*", "/"};
        operatorBox = new JComboBox<>(operators);
        add(operatorBox);

        
        calculateButton = new JButton("Calculate");
        calculateButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double num1 = Double.parseDouble(num1Field.getText());
                double num2 = Double.parseDouble(num2Field.getText());
                String operator = (String) operatorBox.getSelectedItem();
                double result = 0;

                switch(operator) {
                    case "+":
                        result = num1 + num2;
                        break;
                    case "-":
                        result = num1 - num2;
                        break;
                    case "*":
                        result = num1 * num2;
                        break;
                    case "/":
                        result = num1 / num2;
                        break;
                }

                JOptionPane.showMessageDialog(null, "Result: " + result);
            }
        });
        add(calculateButton);

      
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }
    public static void main(String[] args) {
        new Calculator();
    }
}