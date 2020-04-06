public class QuadraticEquation {

    private double a;
    private double b;
    private double c;
    private double firstRoot;
    private double secondRoot;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getFirstRoot() {
        return firstRoot;
    }

    public double getSecondRoot() {
        return secondRoot;
    }

    public double getDiscriminant() {
        return (Math.pow(b, 2) - 4 * a * c);
    }

    public void solve() throws NegativeDiscriminantException {
        double discriminant = getDiscriminant();
        if (discriminant > 0.0) {
            firstRoot = (-b + Math.sqrt(discriminant)) / (2 * a);
            secondRoot = (-b - Math.sqrt(discriminant)) / (2 * a);
        } else if (discriminant == 0.0) {
            firstRoot = -b / (2 * a);
            secondRoot = firstRoot;
        } else {
            throw (new NegativeDiscriminantException("Negative discriminant." +
                    " No real roots. Please, check your coefficients."));
        }
    }
}
