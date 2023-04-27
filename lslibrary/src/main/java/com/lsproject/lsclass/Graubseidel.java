package com.lsproject.lsclass;

import java.io.IOException;
import org.la4j.*;
import org.la4j.vector.dense.BasicVector;

public class Graubseidel extends LSSolver {

    public Graubseidel(String str) throws IOException {
        super(str);
    }

    public Graubseidel(Matrix aIn, Vector bIn, Vector xIn) {
        super(aIn, bIn, xIn);
    }

    public void reset() {

    }

    public Vector risoluzione(Vector xVecchio) {
        Vector solutionX = new BasicVector(new double[sol.length()]);
        for (int i = 0; i < sol.length(); i++) {
            double sum = b.get(i);
            for (int j = 0; j < a.columns(); j++) {
                if (j > i) {
                    sum -= a.get(i, j) * xVecchio.get(j);
                }
                if (j < i) {
                    sum -= a.get(i, j) * solutionX.get(j);
                }
            }
            solutionX.set(i, sum / diag.get(i));
        }
        return solutionX;
    }
}