package moneycalculator;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import moneycalculator.control.Command;
import moneycalculator.ui.MoneyDialog;
import moneycalculator.ui.MoneyDisplay;
import moneycalculator.ui.swing.SwingMoneyDialog;
import moneycalculator.ui.swing.SwingMoneyDisplay;

public class MainFrame extends JFrame {

    private Map<String,Command> commands = new HashMap<>();
    private MoneyDialog moneyDialog;
    private MoneyDisplay moneyDisplay;

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

    public void add(Command command) {
        commands.put(command.name(), command);
    }
    
    public MoneyDialog getMoneyDialog() {
        return moneyDialog;
    }

    public MoneyDisplay getMoneyDisplay() {
        return moneyDisplay;
    }
    
    private Component MoneyDialog() {
        SwingMoneyDialog dialog = new SwingMoneyDialog();
        moneyDialog = dialog;
        return dialog;
    }

    private Component MoneyDisplay() {
        SwingMoneyDisplay display = new SwingMoneyDisplay();
        moneyDisplay = display;
        return display;
    }

    private Component toolbar() {
        JPanel panel = new JPanel();
        panel.add(calculateButton());
        return panel;
    }

    private JButton calculateButton() {
        JButton button = new JButton("Calculate");
        button.addActionListener(calculate());
        return button;
    }

    private ActionListener calculate() {
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                commands.get("calculate").execute();
            }
        };
    }

    
    
}
