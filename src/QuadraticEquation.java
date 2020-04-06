import java.util.ArrayList;

public class QuadraticEquation {
    private double coefficientA;
    private double coefficientB;
    private double coefficientC;

    public QuadraticEquation(ArrayList<Double> coefficients) {
        coefficientA = coefficients.get(0);
        coefficientB = coefficients.get(1);
        coefficientC = coefficients.get(2);
    }

    public String getSolution() throws NegativeDiscriminantException {
        if (coefficientA == 0) {
            return "Equation is not quadratic";
        } else {
            double discriminant = coefficientB * coefficientB - 4 * coefficientA * coefficientC;
            if (discriminant > 0)
                return "x1 = "  + getFirstRoot(discriminant) + "; x2 = " + getSecondRoot(discriminant);
            else if (discriminant == 0)
                return "x = " + getSingleRoot();
            else
                throw new NegativeDiscriminantException("Discriminant is negative");
        }
    }

    private double getFirstRoot(double discriminant) {
        return (-1 * coefficientB + Math.sqrt(discriminant)) / (2 * coefficientA);
    }

    private double getSecondRoot(double discriminant) {
        return (-1 * coefficientB - Math.sqrt(discriminant)) / (2 * coefficientA);
    }

    private double getSingleRoot() {
        return (-1 * coefficientB) / (2 * coefficientA);
    }
}