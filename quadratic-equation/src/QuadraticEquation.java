public class QuadraticEquation {

    private final double A;
    private final double B;
    private final double C;
    private double firstRoot;
    private double secondRoot;

    public QuadraticEquation(double a, double b, double c) {
        this.A = a;
        this.B = b;
        this.C = c;
    }

    public double getFirstRoot() {
        return firstRoot;
    }

    public double getSecondRoot() {
        return secondRoot;
    }

    public void solve() throws NegativeDiscriminantException {
        double discriminant = countDiscriminant();
        if (discriminant > 0.0) {
            firstRoot = (-B + Math.sqrt(discriminant)) / (2 * A);
            secondRoot = (-B - Math.sqrt(discriminant)) / (2 * A);
        } else if (discriminant == 0.0) {
            firstRoot = -B / (2 * A);
            secondRoot = firstRoot;
        } else {
            throw new NegativeDiscriminantException("Negative discriminant." +
                    " No real roots. Please, check your coefficients.");
        }
    }

    private double countDiscriminant() {
        return Math.pow(B, 2) - 4 * A * C;
    }
}
