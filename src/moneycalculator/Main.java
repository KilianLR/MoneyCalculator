package moneycalculator;

import moneycalculator.control.CalculateCommand;

public class Main {

    public static void main(String[] args) {
        MainFrame mainFrame = new MainFrame();
        mainFrame.add(new CalculateCommand(mainFrame.getMoneyDialog(), mainFrame.getMoneyDisplay()));
    }
    
}
