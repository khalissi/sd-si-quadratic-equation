package by.nc.khoroneko.service;

import by.nc.khoroneko.entity.QuadraticEquation;
import by.nc.khoroneko.exception.NegativeDiscriminantException;
import by.nc.khoroneko.exception.ServiceException;

import java.util.List;

public interface QuadraticEquationSolver {

    List<Double> solve(QuadraticEquation quadraticEquation) throws NegativeDiscriminantException, ServiceException;
}
