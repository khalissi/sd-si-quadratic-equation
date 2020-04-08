package by.nc.khoroneko.service.impl;

import by.nc.khoroneko.entity.QuadraticEquation;
import by.nc.khoroneko.exception.NegativeDiscriminantException;
import by.nc.khoroneko.exception.ServiceException;
import by.nc.khoroneko.service.QuadraticEquationSolver;

import java.util.ArrayList;
import java.util.List;

public class QuadraticEquationThroughDiscriminantSolverImpl implements QuadraticEquationSolver {
    private static final double BOUND = 0;

    @Override
    public List<Double> solve(QuadraticEquation quadraticEquation) throws NegativeDiscriminantException, ServiceException {
        if (quadraticEquation == null) {
            throw new ServiceException("Invalid quadratic exception");
        }
        return calculateRoots(quadraticEquation, calculateDiscriminant(quadraticEquation));
    }

    private double calculateDiscriminant(QuadraticEquation quadraticEquation) throws NegativeDiscriminantException {
        double discriminant = Math.pow(quadraticEquation.getbCoefficient(), 2) -
                4 * quadraticEquation.getaCoefficient() * quadraticEquation.getcCoefficient();
        if (discriminant < BOUND) {
            throw new NegativeDiscriminantException();
        }
        return discriminant;
    }

    private List<Double> calculateRoots(QuadraticEquation quadraticEquation, double discriminant) {
        List<Double> roots = new ArrayList<>();
        roots.add((-quadraticEquation.getbCoefficient() + Math.sqrt(discriminant))
                / (2 * quadraticEquation.getaCoefficient()));

        roots.add((-quadraticEquation.getbCoefficient() - Math.sqrt(discriminant))
                / (2 * quadraticEquation.getaCoefficient()));
        return roots;
    }


}
