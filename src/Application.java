public class Application {
    public static void main(String[] args) {
        Printer printer = new Printer();
        QuadraticEquation equation = new QuadraticEquation(printer.inputCoefficients());
        printer.outputEquation();
        try {
            printer.outputSolution(equation.solveEquation());
        } catch (NegativeDiscriminantException ex) {
            System.out.print(ex.getMessage());
        }
    }
}
