package controller;

import model.logic.CalculatorQuadraticEquation;
import util.NegativeDiscriminantException;
import util.UserInput;
import view.Printer;

public class HomeTask {

    public static void main(String[] args) throws NegativeDiscriminantException {
        Printer.print("Enter the quadratic coefficients:");
        double a = UserInput.inputDouble("a: ", false);
        double b = UserInput.inputDouble("b: ", true);
        double c = UserInput.inputDouble("c: ", true);
        Printer.print("Your quadratic equation: " + a + "x^2 + " + b + "x + " + c + " = 0");
        try {
            double[] result = CalculatorQuadraticEquation.calculateQuadraticEquation(a, b, c);
            if (result.length == 2) {
                Printer.print("Roots: " + result[0] + ", " + result[1]);
            } else {
                Printer.print("Root: " + result[0]);
            }
        } catch (NegativeDiscriminantException e) {
            Printer.print("No roots");
        }
    }
}
