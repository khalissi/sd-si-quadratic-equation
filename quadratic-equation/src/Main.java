import java.util.InputMismatchException;

public class Main {

    public static void main(String[] arg) {
        try {
            CoefficientsScanner coefficientsScanner = new CoefficientsScanner();
            QuadraticEquation quadraticEquation = coefficientsScanner.scanEquationCoefficients();
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
