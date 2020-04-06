public class QuadraticEquation {

    private final double a;
    private final double b;
    private final double c;
    private double firstRoot;
    private double secondRoot;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getFirstRoot() {
        return firstRoot;
    }

    public double getSecondRoot() {
        return secondRoot;
    }

    public void solve() throws NegativeDiscriminantException {
        double discriminant = calculateDiscriminantValue();
        if (discriminant > 0.0) {
            firstRoot = (-b + Math.sqrt(discriminant)) / (2 * a);
            secondRoot = (-b - Math.sqrt(discriminant)) / (2 * a);
        } else if (discriminant == 0.0) {
            firstRoot = -b / (2 * a);
            secondRoot = firstRoot;
        } else {
            throw new NegativeDiscriminantException("Negative discriminant." +
                    " No real roots. Please, check your coefficients.");
        }
    }

    private double calculateDiscriminantValue() {
        return Math.pow(b, 2) - 4 * a * c;
    }
}
