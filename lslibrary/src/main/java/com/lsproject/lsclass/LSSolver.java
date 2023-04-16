package com.lsproject.lsclass;

import java.math.*;
import org.la4j.*;
import org.la4j.matrix.dense.Basic1DMatrix;
import org.la4j.matrix.dense.Basic2DMatrix;
import org.la4j.vector.dense.BasicVector;

public abstract class LSSolver {

    protected int maxIter;
    protected double tol;

    // matrix with la4j library
    Matrix matrixA;
    Vector vectorB;
    Vector solutionX;

    // prova
    Matrix a = new Basic2DMatrix(new double[][] { { 3, -1, 1 }, { 2, 6, -1 }, { 1, 1, 7 } });
    Vector b = new BasicVector(new double[] { 0, 0, 0 });
    Vector sol = new BasicVector(new double[] { 1, 1, 1 });
    Vector diag;

    public LSSolver(int maxinumIteration, double tollerance) {
        maxIter = maxinumIteration; // check nel file exe che sia < di 20'000
        tol = tollerance;

        // calcolo b
        b = a.multiply(sol);

        // calcolo diagonale
        diag = new BasicVector(new double[b.length()]);
        for (int i = 0; i < a.columns(); i++) {
            diag.set(i, a.get(i, i));
        }
    }

    public void executeMethods() {
        System.out.println(b.toString());
        System.out.println(diag.toString());
    }

    public double norma2(Vector v) {
        double s = 0;
        for (int i = 0; i < v.length(); i++) {
            s += Math.pow(v.get(i), 2);
        }
        return Math.sqrt(s);
    }
}