package moneycalculator.ui.swing;

import java.awt.Component;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JTextField;
import moneycalculator.model.Money;
import moneycalculator.model.Currency;
import moneycalculator.ui.MoneyDialog;

public class SwingMoneyDialog extends JPanel implements MoneyDialog {

    private Currency currency;
    
    public SwingMoneyDialog() {
        this.add(amount());
        this.add(currency());
    }
    
    @Override
    public Money get() {
        return new Money(0, currency);
    }

    private Component amount() {
        return new JTextField();
    }

    private Component currency() {
        return new JComboBox(currencies());
    }

    private Currency[] currencies() {
        return new Currency[] {
            new Currency("USD", "Dólar USA", "$"),
            new Currency("CAD", "Dólar Canadá", "$"),
            new Currency("GBP", "Libra esterlina", "$")
        };
    }
}