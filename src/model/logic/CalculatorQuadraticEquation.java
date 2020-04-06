package model.logic;

import util.NegativeDiscriminantException;

public class CalculatorQuadraticEquation {

    private static final int BOUNDARY_VALUE = 0;

    private static double calculateDiscriminant(double a, double b, double c) {
        return Math.pow(b, 2) - 4 * a * c;
    }

    private static double[] calculateTwoRadicals(double a, double b, double discriminant) {

        double result1 = (-b + Math.sqrt(discriminant)) / (2 * a);
        double result2 = (-b - Math.sqrt(discriminant)) / (2 * a);

        return new double[]{result1, result2};
    }

    private static double calculateOneRadical(double a, double b) {
        return -b / (2 * a);
    }

    public static double[] calculateQuadraticEquation(double a, double b, double c) throws NegativeDiscriminantException {
        double discriminant = calculateDiscriminant(a, b, c);

        if (discriminant > BOUNDARY_VALUE) {
            return calculateTwoRadicals(a, b, discriminant);
        } else if (discriminant == BOUNDARY_VALUE) {
            return new double[]{calculateOneRadical(a, b)};
        } else {
            throw new NegativeDiscriminantException();
        }
    }
}
