import java.util.Scanner;

public class QuadraticEquation {

    private int coefficientA;
    private int coefficientB;
    private int coefficientC;

    public void solveEquation() throws NegativeDiscriminantException {
        inputCoefficients();
        System.out.println(this);

        if (getDiscriminant() > 0)
            System.out.print("x1 = " + getFirstRoot() + "; x2 = " + getSecondRoot());
        else if (getDiscriminant() == 0)
            System.out.print("x = " + getSingleRoot());
        else
            throw new NegativeDiscriminantException("Discriminant is negative");
    }

    private double getDiscriminant(){
        return coefficientB * coefficientB - 4 * coefficientA * coefficientC;
    }

    private double getFirstRoot(){
        return (-1 * coefficientB + Math.sqrt(getDiscriminant())) / (2 * coefficientA);
    }

    private double getSecondRoot(){
        return (-1 * coefficientB - Math.sqrt(getDiscriminant())) / (2 * coefficientA);
    }

    private double getSingleRoot(){
        return (-1 * coefficientB) / (2 * coefficientA);
    }

    private void inputCoefficients() throws NegativeDiscriminantException{
        Scanner firstCoefficient = new Scanner(System.in);
        Scanner secondCoefficient = new Scanner(System.in);
        Scanner thirdCoefficient = new Scanner(System.in);
        System.out.print("Input a = ");
        coefficientA = firstCoefficient.nextInt();
        System.out.print("b = ");
        coefficientB = secondCoefficient.nextInt();
        System.out.print("c = ");
        coefficientC = thirdCoefficient.nextInt();
        if(coefficientA == 0 || coefficientB == 0 || coefficientC == 0) {
            System.out.println(
                    "It is not quadratic equation. " +
                    "Input coefficients again"
            );
            solveEquation();
        }
        firstCoefficient.close();
        secondCoefficient.close();
        thirdCoefficient.close();
    }

    @Override
    public String toString() {
        return coefficientA + "x^2 + "
                + coefficientB + "x + "
                + coefficientC + " = 0";
    }
}