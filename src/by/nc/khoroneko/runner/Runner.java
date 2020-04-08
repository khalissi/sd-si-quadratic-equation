package by.nc.khoroneko.runner;

import by.nc.khoroneko.entity.QuadraticEquation;
import by.nc.khoroneko.exception.NegativeDiscriminantException;
import by.nc.khoroneko.exception.ServiceException;
import by.nc.khoroneko.service.QuadraticEquationSolver;
import by.nc.khoroneko.service.impl.QuadraticEquationThroughDiscriminantSolverImpl;
import by.nc.khoroneko.util.UserInput;
import by.nc.khoroneko.view.Printer;

public class Runner {
    public static void main(String[] args) {
        double a;
        double b;
        double c;
        UserInput userInput = new UserInput();
        Printer printer = new Printer();
        a = userInput.inputDouble("Enter A coefficient");
        b = userInput.inputDouble("Enter B coefficient");
        c = userInput.inputDouble("Enter C coefficient");

        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
        QuadraticEquationSolver solver = new QuadraticEquationThroughDiscriminantSolverImpl();
        try {
            printer.printList(solver.solve(quadraticEquation));
        } catch (ServiceException | NegativeDiscriminantException e) {
            printer.printString("Wrong source data");
        }
    }
}
