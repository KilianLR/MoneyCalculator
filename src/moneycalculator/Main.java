package moneycalculator;

import moneycalculator.control.CalculateCommand;
import moneycalculator.model.Currency;
import moneycalculator.persistence.CurrencyListLoader;

public class Main {

    public static void main(String[] args) {
        CurrencyListLoader loader = currencyListLoader();
        MainFrame mainFrame = new MainFrame(loader.currencies());
        mainFrame.add(new CalculateCommand(mainFrame.getMoneyDialog(), mainFrame.getMoneyDisplay()));
    }

    private static CurrencyListLoader currencyListLoader() {
        return new CurrencyListLoader() {
            @Override
            public Currency[] currencies() {
                return new Currency[] {
                    new Currency("USD", "Dólar USA", "$"),
                    new Currency("CAD", "Dólar Canadá", "$"),
                    new Currency("GBP", "Libra esterlina", "£")
                };
            }
        };
    }
    
}
