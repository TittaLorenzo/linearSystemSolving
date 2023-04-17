package com.lsproject.lsclass;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import org.la4j.*;
import org.la4j.matrix.dense.Basic2DMatrix;
import org.la4j.vector.dense.BasicVector;
import org.la4j.Matrix;
import java.io.IOException;

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

    public LSSolver(int maxinumIteration, double tollerance, String str) throws IOException {
        maxIter = maxinumIteration; // check nel file exe che sia < di 20'000
        tol = tollerance;
        a = ImportMtxFile(str);   
        setMatrix();    
    }

    public void setMatrix(){
        b = new BasicVector(a.columns());
        sol = new BasicVector(a.columns());
        for (int i = 0; i < a.columns(); i++) {
            sol.set(i, 1);
        }
        // calcolo b
        b = a.multiply(sol);
        // System.out.println(b);
        // calcolo diagonale
        diag = new BasicVector(new double[b.length()]);
        for (int i = 0; i < a.columns(); i++) {
            diag.set(i, a.get(i, i));
        }
    }

    public void executeMethods() {

    }

    public double norma2(Vector v) {
        double s = 0;
        for (int i = 0; i < v.length(); i++) {
            s += Math.pow(v.get(i), 2);
        }
        return Math.sqrt(s);
    }

    public Matrix ImportMtxFile(String fileName) throws IOException {
        File file = new File(fileName);
        BufferedReader br = new BufferedReader(new FileReader(file));
        String intestazione = br.readLine();
        String[] temp = intestazione.split(" ");
        Matrix m1 = new Basic2DMatrix(Integer.parseInt(temp[0]), Integer.parseInt(temp[2]));
        for (int i = 0; i < Integer.parseInt(temp[4]); i++) {
            String valori = br.readLine();
            String[] arr = valori.split(" ");
            m1.set(Integer.parseInt(arr[0]) - 1, Integer.parseInt(arr[2]) - 1, Double.parseDouble(arr[4]));
        }
        br.close();
        return m1;
    }

}