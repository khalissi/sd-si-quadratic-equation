public class QuadraticEquation {
    private double coefficientA;
    private double coefficientB;
    private double coefficientC;

    public double getCoefficientA() {
        return coefficientA;
    }

    public void setCoefficientA(double coefficientA) {
        this.coefficientA = coefficientA;
    }

    public double getCoefficientB() {
        return coefficientB;
    }

    public void setCoefficientB(double coefficientB) {
        this.coefficientB = coefficientB;
    }

    public double getCoefficientC() {
        return coefficientC;
    }

    public void setCoefficientC(double coefficientC) {
        this.coefficientC = coefficientC;
    }

    public void solveEquation() throws NegativeDiscriminantException {
        Printer printer = new Printer();
        printer.inputCoefficients(this);
        if (coefficientA == 0) {
            return;
        } else {
            printer.outputEquation(this);
            double discriminant = coefficientB * coefficientB - 4 * coefficientA * coefficientC;
            if (discriminant > 0)
                printer.outputSolution(getFirstRoot(discriminant), getSecondRoot(discriminant));
            else if (discriminant == 0)
                printer.outputSolution(getSingleRoot());
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