package com.lsproject.lsclass;

import java.io.IOException;
import java.math.*;
import org.la4j.*;
import org.la4j.matrix.dense.Basic1DMatrix;
import org.la4j.matrix.dense.Basic2DMatrix;
import org.la4j.vector.dense.BasicVector;

public class Jacobi extends LSSolver {

    public Jacobi(int maxinumIteration, double tollerance, String str) throws IOException {
        super(maxinumIteration, tollerance, str);
    }

    public Jacobi(String str) throws IOException {
        this(20000, 1e-4, str);
    }

    public void executeMethods() {
        for(int t=1; t<5; t++){
            setMatrix();
            if(t==1){
                tol = 1e-4;
            }
            else if(t==2){
                tol = 1e-6;
            }
            else if(t==3){
                tol = 1e-8;
            }
            else{
                tol = 1e-10;
            }
            Vector xVecchio = new BasicVector(new double[sol.length()]);
        for (int i = 0; i < xVecchio.length(); i++) {
            xVecchio.set(i, 0);
        }
        double delta = 0;
        int k = 0;
        do {
            solutionX = new BasicVector(new double[sol.length()]);

            // calcolo soluzione
            for (int i = 0; i < sol.length(); i++) {
                double sum = b.get(i);
                for (int j = 0; j < a.columns(); j++) {
                    if (j != i) {
                        sum -= a.get(i, j) * xVecchio.get(j);
                    }
                }
                solutionX.set(i, sum / diag.get(i));
            }

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
}