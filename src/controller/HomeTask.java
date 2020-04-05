package controller;

import model.logic.CalculatorQuadraticEquation;
import util.MyException;
import util.UserInput;
import view.Printer;

public class HomeTask {

    public static void main(String[] args) throws MyException {
        Printer.print("Enter the quadratic coefficients:");
        int a = UserInput.inputIntNotNull("a: ");
        int b = UserInput.inputInt("b: ");
        int c = UserInput.inputInt("c: ");
        Printer.print("Your quadratic equation: " + a + "x^2 + " + b + "x + " + c + " = 0");
        try {
            double[] result = CalculatorQuadraticEquation.calculationQuadraticEquation(a, b, c);
            if (result.length == 2) {
                Printer.print("Roots: " + result[0] + ", " + result[1]);
            } else {
                Printer.print("Root: " + result[0]);
            }
        } catch (MyException e) {
            Printer.print("No roots");
        }
    }
}
