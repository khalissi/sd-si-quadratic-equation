import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class CoefficientsScanner {

    public List<Double> scanEquationCoefficients() throws InputMismatchException {
        Scanner scanner = new Scanner(System.in);
        List<Double> coefficients = new ArrayList<>();
        System.out.println("Please, enter coefficient 'a': ");
        coefficients.add(scanner.nextDouble());
        System.out.println("Please, enter coefficient 'b': ");
        coefficients.add(scanner.nextDouble());
        System.out.println("Please, enter coefficient 'c': ");
        coefficients.add(scanner.nextDouble());
        scanner.close();

        return coefficients;
    }
}
