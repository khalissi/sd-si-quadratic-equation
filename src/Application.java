public class Application {
    public static void main(String[] args) {
        QuadraticEquation qe = new QuadraticEquation();
        try {
            qe.solveEquation();
        } catch (NegativeDiscriminantException ex) {
            System.out.print(ex.getMessage());
        }
    }
}
