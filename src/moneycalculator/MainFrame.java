package moneycalculator;

import java.awt.BorderLayout;
import java.awt.Component;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import moneycalculator.ui.swing.SwingMoneyDialog;
import moneycalculator.ui.swing.SwingMoneyDisplay;

public class MainFrame extends JFrame {

    public MainFrame() {
        this.setTitle("Money Calculator");
        this.setSize(400, 400);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
        this.add(MoneyDialog(), BorderLayout.NORTH);
        this.add(MoneyDisplay(), BorderLayout.CENTER);
        this.add(toolbar(), BorderLayout.SOUTH);
    }

    private Component MoneyDialog() {
        return new SwingMoneyDialog();
    }

    private Component MoneyDisplay() {
        return new SwingMoneyDisplay();
    }

    private Component toolbar() {
        JPanel panel = new JPanel();
        panel.add(calculateButton());
        return panel;
    }

    private JButton calculateButton() {
        JButton button = new JButton("Calculate");
        return button;
    }

    
    
}
