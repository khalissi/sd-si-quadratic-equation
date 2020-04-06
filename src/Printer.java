import java.util.Scanner;

public class Printer {
    public void inputCoefficients(QuadraticEquation equation) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a = ");
        equation.setCoefficientA(scanner.nextDouble());
        if (equation.getCoefficientA() == 0) {
            System.out.print("Equation is not quadratic");
        } else {
            System.out.print("b = ");
            equation.setCoefficientB(scanner.nextDouble());
            System.out.print("c = ");
            equation.setCoefficientC(scanner.nextDouble());
        }
        scanner.close();
    }

    public void outputEquation(QuadraticEquation equation) {
        System.out.println(
                equation.getCoefficientA() + "x^2 + "
                + equation.getCoefficientB() + "x + "
                + equation.getCoefficientC() + " = 0"
        );
    }

    public void outputSolution(double firstRoot, double secondRoot) {
        System.out.print("x1 = " + firstRoot + "; x2 = " + secondRoot);
    }

    public void outputSolution(double root) {
        System.out.print("x = " + root);
    }
}