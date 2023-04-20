package com.lsproject.lsclass;

import java.io.IOException;
import org.la4j.*;
import org.la4j.vector.dense.BasicVector;

public class Gradiente extends LSSolver {

    public Gradiente(int maxinumIteration, double tollerance, String str) throws IOException {
        super(maxinumIteration, tollerance, str);
    }

    public Gradiente(String str) throws IOException {
        this(20000, 1e-4, str);
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
            solutionX = new BasicVector(new double[sol.length()]);
            for (int i = 0; i < xVecchio.length(); i++) {
                xVecchio.set(i, 0);
                solutionX.set(i, 0);
            }
            double delta = 0;
            int k = 0;
            do {
                solutionX = new BasicVector(new double[sol.length()]);

                // calcolo soluzione
                Vector residuo = b.subtract(a.multiply(xVecchio));
                Vector y = a.multiply(residuo);
                Double va = prodottoScalare(residuo, residuo);
                Double vb = prodottoScalare(residuo, y);
                Double alpha = va / vb;
                solutionX = xVecchio.add(residuo.multiply(alpha));
                // verifica convergenza
                delta = norma2(solutionX.subtract(xVecchio)) / norma2(solutionX);
                xVecchio = solutionX;

                if (k > maxIter) {
                    System.out.println("Errore: Raggiunto il numero massimo di iterazioni");
                    break;
                }
                k++;
            } while (delta > tol);
            System.out.println(
                    "soluzione con metodo di gauss seidel co tolleranza a: " + tol + " in " + k + " iterazioni: ");
            System.out.println("Errore assoluto:");
            System.out.println(String.format("%.20f", (norma2(sol.subtract(solutionX)))));
            System.out.println("Errore relativo:");
            System.out.println(String.format("%.20f", (norma2(sol.subtract(solutionX)) / norma2(sol))));
            System.out.println();
        }

    }
}
