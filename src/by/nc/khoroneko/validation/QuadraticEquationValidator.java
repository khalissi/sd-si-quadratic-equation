package by.nc.khoroneko.validation;

import by.nc.khoroneko.entity.QuadraticEquation;

public class QuadraticEquationValidator {
    private static final double WRONG_COEFFICIENT = 0;
    public boolean isValid(QuadraticEquation quadraticEquation) {
        return isValidACoefficient(quadraticEquation);
    }

    private boolean isValidACoefficient(QuadraticEquation quadraticEquation) {
        return quadraticEquation.getaCoefficient() != 0;
    }
}
