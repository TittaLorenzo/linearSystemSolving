package com.lsproject.lsclass;

import java.math.*;
import org.la4j.*;
import org.la4j.matrix.dense.Basic1DMatrix;
import org.la4j.matrix.dense.Basic2DMatrix;
import org.la4j.vector.dense.BasicVector;

public class LSSolver {

    protected int maxIter;
    protected double tol;
    
    //matrix with la4j library
    Matrix matrixA;
    Vector vectorB;
    Vector solutionX;

    //prova
    Matrix a = new Basic2DMatrix(new double[][] {{3, -1, 1}, {2, 6, -1}, {1, 1, 7}});
    Vector b = new BasicVector(new double[] {0, 0, 0});
    Vector sol = new BasicVector(new double[] {1, 1, 1});

    public LSSolver(int maxinumIteration, double tollerance){
        maxIter = maxinumIteration; //check nel file exe che sia < di 20'000
        tol = tollerance;
    }

    public LSSolver(){
        tol = 1e-6;
        maxIter = 20000;
    }

    public void executeMethods(){
        b = a.multiply(sol);
        System.out.println(b.toString());
    }
}