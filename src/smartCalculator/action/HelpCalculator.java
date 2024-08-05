package smartCalculator.action;

import smartCalculator.action.Action;

public class HelpCalculator implements Action {

    @Override
    public void action(String str) {
        System.out.println("The program calculates the sum of numbers");
    }
}
