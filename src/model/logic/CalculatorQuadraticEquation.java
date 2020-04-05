package model.logic;

import util.MyException;

public class CalculatorQuadraticEquation {

    private static final int BOUNDARY_VALUE = 0;
    private static final String ERROR = "No roots";

    private static double calculationDiscriminant(int a, int b, int c) {
        return Math.pow(b, 2) - 4 * a * c;
    }

    private static double[] calculationTwoRadicals(int a, int b, int c) {

        double discriminant = calculationDiscriminant(a, b, c);
        double result1 = (-b + Math.sqrt(discriminant)) / (2 * a);
        double result2 = (-b - Math.sqrt(discriminant)) / (2 * a);

        return new double[]{result1, result2};
    }

    private static int calculationOneRadical(int a, int b, int c) {
        return -b / (2 * a);
    }

    public static double[] calculationQuadraticEquation(int a, int b, int c) throws MyException {
        double discriminant = calculationDiscriminant(a, b, c);
        double[] result;

        if (discriminant > BOUNDARY_VALUE) {
            result = calculationTwoRadicals(a, b, c);
        } else if (discriminant == BOUNDARY_VALUE) {
            result = new double[]{calculationOneRadical(a, b, c)};
        } else {
            throw new MyException();
        }
        return result;
    }
}
