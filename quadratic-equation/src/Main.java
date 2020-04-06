import java.util.InputMismatchException;
import java.util.List;

public class Main {

    public static void main(String[] arg) {
        try {
            CoefficientsScanner coefficientsScanner = new CoefficientsScanner();
            List<Double> coefficients = coefficientsScanner.scanEquationCoefficients();
            QuadraticEquation quadraticEquation =
                    new QuadraticEquation(coefficients.get(0), coefficients.get(1), coefficients.get(2));
            quadraticEquation.solve();

            System.out.println("First root: " + quadraticEquation.getFirstRoot() +
                    "\nSecond root: " + quadraticEquation.getSecondRoot());
        } catch (NegativeDiscriminantException exception) {
            System.err.println(exception.getMessage());
        } catch (InputMismatchException exception) {
            System.err.println("Invalid coefficient.");
        }
    }
}
