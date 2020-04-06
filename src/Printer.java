import java.util.ArrayList;
import java.util.Scanner;

public class Printer {
    private ArrayList<Double> coefficients = new ArrayList<>();

    public ArrayList<Double> inputCoefficients() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a = ");
        coefficients.add(scanner.nextDouble());
        System.out.print("b = ");
        coefficients.add(scanner.nextDouble());
        System.out.print("c = ");
        coefficients.add(scanner.nextDouble());
        scanner.close();
        return coefficients;
    }

    public void outputEquation() {
        System.out.println(
                coefficients.get(0) + "x^2 + "
                + coefficients.get(1) + "x + "
                + coefficients.get(2) + " = 0"
        );
    }

    public void outputSolution(String result) {
        System.out.print(result);
    }
}