package com.lsproject.lsclass;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import org.la4j.*;
import org.la4j.matrix.sparse.CCSMatrix;
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
    Matrix a = new CCSMatrix();
    Vector b = new BasicVector(new double[] { 0, 0, 0 });
    Vector sol = new BasicVector(new double[] { 1, 1, 1 });
    Vector diag;

    public LSSolver(int maxinumIteration, double tollerance, String str) throws IOException {
        maxIter = maxinumIteration; // check nel file exe che sia < di 20'000
        tol = tollerance;
        a = ImportMtxFile(str);
        setMatrix();
    }

    public void setMatrix() {
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
        for (int t = 1; t < 5; t++) {
            setMatrix();
            if (t == 1) {
                tol = 1e-4;
            } else if (t == 2) {
                tol = 1e-6;
            } else if (t == 3) {
                tol = 1e-8;
            } else {
                tol = 1e-10;
            }
            Vector xVecchio = new BasicVector(new double[sol.length()]);
            for (int i = 0; i < xVecchio.length(); i++) {
                xVecchio.set(i, 0);
            }
            double delta = 0;
            int k = 0;
            do {
                // calcolo soluzione
                solutionX = risoluzione(xVecchio);
                // verifica convergenza
                delta = norma2(solutionX.subtract(xVecchio)) / norma2(solutionX);
                xVecchio = solutionX;
                if (k > maxIter) {
                    System.out.println("Errore: Raggiunto il numero massimo di iterazioni");
                    break;
                }
                k++;
            } while (delta > tol);
            System.out.println("soluzione con metodo di jacobi co tolleranza a: " + tol + " in " + k + " iterazioni: ");
            System.out.println("Errore assoluto:");
            System.out.println(String.format("%.20f", (norma2(sol.subtract(solutionX)))));
            System.out.println("Errore relativo:");
            System.out.println(String.format("%.20f", (norma2(sol.subtract(solutionX)) / norma2(sol))));
            System.out.println();
        }

    }

    public abstract Vector risoluzione(Vector xVecchio);

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
        Matrix m1 = new CCSMatrix(Integer.parseInt(temp[0]), Integer.parseInt(temp[2]));
        for (int i = 0; i < Integer.parseInt(temp[4]); i++) {
            String valori = br.readLine();
            String[] arr = valori.split(" ");
            m1.set(Integer.parseInt(arr[0]) - 1, Integer.parseInt(arr[2]) - 1, Double.parseDouble(arr[4]));
        }
        br.close();
        return m1;
    }

    public Matrix inversa(Matrix m) {
        Matrix inversa = new CCSMatrix(m.rows(), m.columns());
        if (m.determinant() != 0) {
            for (int i = 0; i < m.rows(); i++) {
                for (int j = 0; j < m.columns(); j++) {

                }
            }
        } else {
            return null;
        }
        return inversa;
    }

    public static double prodottoScalare(Vector v1, Vector v2) {
        double sum = 0;
        if (v1.length() == v2.length()) {
            for (int i = 0; i < v1.length(); i++) {
                sum += v1.get(i) * v2.get(i);
            }
        } else {
            return 0;
        }
        return sum;
    }
}